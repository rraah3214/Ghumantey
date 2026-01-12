package Ghumantey.fyp.Ghumantey.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Ghumantey.fyp.Ghumantey.entity.GuideDetail;

public interface GuideDetailDao extends JpaRepository<GuideDetail, Integer> {
	
	public GuideDetail findByGuide_Name(String guide_name);
	public GuideDetail findByLocation(String location);
	public GuideDetail findByRatings(String ratings);
	public GuideDetail findByDescription(String description);

}
