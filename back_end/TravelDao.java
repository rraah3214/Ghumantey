package Ghumantey.fyp.Ghumantey.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Ghumantey.fyp.Ghumantey.entity.TravelPackages;

public interface TravelDao extends JpaRepository<TravelPackages, Integer> {
	
	public TravelPackages findByBy_Bus(String by_bus);
	public TravelPackages findByBy_Air(String by_air);

}
