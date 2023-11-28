package grifgr.cartridges.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import grifgr.cartridges.domain.Cartridge;

public interface CartridgesDao extends JpaRepository<Cartridge, Integer> {

}
