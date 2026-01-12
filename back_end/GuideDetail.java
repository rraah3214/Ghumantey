package Ghumantey.fyp.Ghumantey.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Guid_Details_Table")

public class GuideDetail implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@	GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Guide_Name")
	private String guide_name;
	@Column(name="Location")
	private String location;
	@Column(name="Number")
	private String number;
	@Column(name="Description")
	private String description;
	@Column(name="Ratings")
	private String ratings;
	
	
	//Generating default constructor
	
	public GuideDetail() {
		super();
	}

	 //Generating constructor using fields
	public GuideDetail(String guide_name, String location, String number, String description, String ratings) {
		super();
		this.guide_name = guide_name;
		this.location = location;
		this.number = number;
		this.description = description;
		this.ratings = ratings;
	}
	 //Generating getter and setter

	public String getGuide_name() {
		return guide_name;
	}

	public void setGuide_name(String guide_name) {
		this.guide_name = guide_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	
  
}
