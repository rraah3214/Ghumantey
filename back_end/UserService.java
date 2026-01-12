package Ghumantey.fyp.Ghumantey.service;

import java.util.List;

import Ghumantey.fyp.Ghumantey.entity.UserDetailsGhumantey;

public interface UserService {
	List<UserDetailsGhumantey> getAllUser();
	UserDetailsGhumantey getUserById(int id);
	UserDetailsGhumantey saveUser(UserDetailsGhumantey user);
	UserDetailsGhumantey updateUser(int id, UserDetailsGhumantey user);
	void deleteUser(int id);
	

}
