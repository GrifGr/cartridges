package grifgr.cartridges.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import grifgr.cartridges.domain.Cartridge;
import grifgr.cartridges.service.CartridgesService;

@Controller
@RequestMapping("/cartridges")
public class CartridgesController {

//	private static final Logger log = LoggerFactory.getLogger(LessonController.class);
	private static final String PATH = "views/cartridges/";
	
	private CartridgesService cartridgesService;

	public CartridgesController(CartridgesService cartridgesService) {
		this.cartridgesService = cartridgesService;
	}
	
    @RequestMapping("/")
    public String getIndex() {
//        log.debug("Open page index");

        return "index";
    }
    
    @GetMapping("/list")
    public String getAll(Model model, Pageable pageable) {
//        log.debug("Open page with all lessons");

        Page<Cartridge> cartridges = cartridgesService.getAll(pageable);
        model.addAttribute("cartridges", cartridges);
        return PATH + "list_cartridges";
    }
	
}
