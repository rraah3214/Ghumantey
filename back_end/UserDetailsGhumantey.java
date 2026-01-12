package Ghumantey.fyp.Ghumantey.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="User_Details_Table")
public class UserDetailsGhumantey implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	@Column(name="first_name")
	private String First_name;
	@Column(name="last_name")
	private String Last_name;
	@Column(name="address")
	private String Address;
	@Column(name="phone_number", unique=true)
	private int Phone_Number;
	@Column(name="email", unique=true)
	private String Email;
	
	
	// creating default constructor
	
	public UserDetailsGhumantey() {
		super();
	}
	// creating constructor using fields


	public UserDetailsGhumantey(int id, String first_name, String last_name, String address, int phone_Number, String email) {
		super();
		this.id = id;
		this.First_name = first_name;
		this.Last_name = last_name;
		this.Address = address;
		this.Phone_Number = phone_Number;
		this.Email = email;
	}
	
	//Generating getter and setter

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirst_name() {
		return First_name;
	}


	public void setFirst_name(String first_name) {
		this.First_name = first_name;
	}


	public String getLast_name() {
		return Last_name;
	}


	public void setLast_name(String last_name) {
		this.Last_name = last_name;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		this.Address = address;
	}


	public int getPhone_Number() {
		return Phone_Number;
	}


	public void setPhone_Number(int phone_Number) {
		this.Phone_Number = phone_Number;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		this.Email = email;
	}
	
	
	

}
