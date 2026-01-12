package Ghumantey.fyp.Ghumantey.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TravelPackages_Details_Table")
public class TravelPackages implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="By Bus")
	private String by_bus;
	@Column(name="By Air")
	private String by_plane;
	//Default constructor
	public TravelPackages() {
		super();
	}
	//paramaterize constructor
	public TravelPackages(String by_bus, String by_plane) {
		super();
		this.by_bus = by_bus;
		this.by_plane = by_plane;
	}
	//generating getter and setter
	public String getBy_bus() {
		return by_bus;
	}
	public void setBy_bus(String by_bus) {
		this.by_bus = by_bus;
	}
	public String getBy_plane() {
		return by_plane;
	}
	public void setBy_plane(String by_plane) {
		this.by_plane = by_plane;
	}
	
	
	

}
