package grifgr.cartridges.restcontroller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import grifgr.cartridges.domain.Cartridge;
import grifgr.cartridges.filter.CartridgesFilter;
import grifgr.cartridges.service.CartridgesService;

@RestController
@RequestMapping("api/cartridges")
public class CartridgesRestController {

	private CartridgesService cartridgesService;

	public CartridgesRestController(CartridgesService cartridgesService) {
		this.cartridgesService = cartridgesService;
	}
	
	@GetMapping
	public Page<Cartridge> getAll(@PageableDefault Pageable pageable, CartridgesFilter cartridgesFilter){
		return cartridgesService.getAll(pageable, cartridgesFilter);		
	}
	
}
