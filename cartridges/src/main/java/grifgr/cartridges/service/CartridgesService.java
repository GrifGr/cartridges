package grifgr.cartridges.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import grifgr.cartridges.domain.Cartridge;
import grifgr.cartridges.filter.CartridgesFilter;

@Service
@Transactional
public class CartridgesService {

	public Page<Cartridge> getAll(Pageable pageable, CartridgesFilter cartridgesFilter) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Cartridge> getAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
