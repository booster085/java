package eu.infostart.jee.jsf;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import eu.infostart.ejb.entity.UserModel;
import eu.infostart.ejb.service.UserService;

@ManagedBean(name="listUsersBean") //it names it this way by default
@RequestScoped
public class ListUsersBean {

	@EJB
	UserService userService;
	
	public List<UserModel> getUsers() {
		List<UserModel> usersList = userService.getAllUsers();
		return usersList;
	}
}
