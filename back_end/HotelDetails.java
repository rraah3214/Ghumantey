package Ghumantey.fyp.Ghumantey.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Hotel_Details_Table")
public class HotelDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Hotel_name")
	private String hotel_name;
	@Column(name="Location")
	private String location;
	@Column(name="number")
	private int number;
	@Column(name="price")
	private double price;
	@Column(name="Description")
	private String description;
	
	//generating default constructor
	public HotelDetails() {
		super();
	}
	
	//generating parameterize constructor
	public HotelDetails(String hotel_name, String location, int number, double price, String description) {
		super();
		this.hotel_name = hotel_name;
		this.location = location;
		this.number = number;
		this.price = price;
		this.description = description;
	}
	
	//Generating getter and setter

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
