package Ghumantey.fyp.Ghumantey.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Ghumantey.fyp.Ghumantey.entity.Trecks;

@Repository
public interface TreckDao extends JpaRepository <Trecks, Integer>{
 public Trecks findByTreck_Name(String treck_name);
 public Trecks findByLocation(String Location);
 

}
