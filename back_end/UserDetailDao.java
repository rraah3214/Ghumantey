package Ghumantey.fyp.Ghumantey.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Ghumantey.fyp.Ghumantey.entity.UserDetailsGhumantey;

@Repository
public interface UserDetailDao extends JpaRepository<UserDetailsGhumantey, Integer> {
	
public UserDetailsGhumantey findByEmail(String email);
public UserDetailsGhumantey findByAddress(String address);
public UserDetailsGhumantey findByFirst_Name(String first_name);
public UserDetailsGhumantey findByLast_Name(String last_name);
public UserDetailsGhumantey findByPhone_Number(int phone_number);
}
