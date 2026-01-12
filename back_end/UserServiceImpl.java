package Ghumantey.fyp.Ghumantey.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ghumantey.fyp.Ghumantey.dao.UserDetailDao;
import Ghumantey.fyp.Ghumantey.entity.UserDetailsGhumantey;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDetailDao userDetailDao;

    @Override
    public List<UserDetailsGhumantey> getAllUser() {
        return userDetailDao.findAll();
    }

    @Override
    public UserDetailsGhumantey getUserById(int id) {
        Optional<UserDetailsGhumantey> optionalUser = userDetailDao.findById(id);
        return optionalUser.orElse(null);
    }

    @Override
    public UserDetailsGhumantey saveUser(UserDetailsGhumantey user) {
        return userDetailDao.save(user);
    }

    @Override
    public UserDetailsGhumantey updateUser(int id, UserDetailsGhumantey user) {
        UserDetailsGhumantey existingUser = getUserById(id);
        if (existingUser != null) {
            existingUser.setFirst_name(user.getFirst_name());
            existingUser.setLast_name(user.getLast_name());
            existingUser.setAddress(user.getAddress());
            existingUser.setPhone_Number(user.getPhone_Number());
            existingUser.setEmail(user.getEmail());
            return userDetailDao.save(existingUser);
        }
        return null;
    }

    @Override
    public void deleteUser(int id) {
        userDetailDao.deleteById(id);
    }
}
