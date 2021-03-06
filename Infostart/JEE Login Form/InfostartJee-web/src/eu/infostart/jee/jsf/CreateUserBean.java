package eu.infostart.jee.jsf;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import eu.infostart.ejb.entity.UserModel;
import eu.infostart.ejb.service.UserService;

@ManagedBean(name = "createUserBean")
@RequestScoped
public class CreateUserBean {

	@EJB
	UserService userService;
	private String username;
	private String password;
	private String email;
	
	public String saveUser() {
		
		if(email != null && !email.contains("@")) {
			FacesMessage errorMessage = new FacesMessage("Not a valid email");
			FacesContext.getCurrentInstance().addMessage(null, errorMessage);
			return null; //return to previous page
		}
		
		UserModel user = new UserModel();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		
		userService.SafeUser(user);
		return "/faces/login.xhtml";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
