package Ghumantey.fyp.Ghumantey.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Trecks_Details_Table")
public class Trecks implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Treck_name")
	private String treck_name;
	@Column(name="Location")
	private String location;
	//Generating default constructor
	public Trecks() {
		super();
	}
	//Generating constructor using class
	public Trecks(String treck_name, String location) {
		super();
		this.treck_name = treck_name;
		this.location = location;
	}
	//Generating getter and setter
	public String getTreck_name() {
		return treck_name;
	}
	public void setTreck_name(String treck_name) {
		this.treck_name = treck_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
