package grifgr.cartridges.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import grifgr.cartridges.domain.Cartridges;

public interface CartridgesDao extends JpaRepository<Cartridges, Integer> {

}
