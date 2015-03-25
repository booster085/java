package eu.infostart.ejb.service;

import java.util.List;

import javax.ejb.Local;

import eu.infostart.ejb.entity.UserModel;

@Local
public interface UserService {

	public UserModel loginUser(String username, String password);
	public void SafeUser (UserModel userModel);
	public List<UserModel> getAllUsers();
	
}
