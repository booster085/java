package eu.infostart.jee.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import eu.infostart.ejb.service.UserService;
import eu.infostart.jee.beans.User;

/**
 * Login servlet responsible for authentication
 * 
 * @author Ilian
 *
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@EJB
	UserService userService;
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("username");
		String pass = request.getParameter("password");
		
		
		
		if (null != userService.loginUser(userName, pass)) {
			
			User loggedUser = new User();
			loggedUser.setUsername(userName);
			loggedUser.setPassword(pass);
			
			HttpSession session = request.getSession();
			session.setAttribute("loggedUser", loggedUser);
			
			response.sendRedirect(request.getContextPath() + "/success.jsp");
			
		} else {
			response.sendRedirect(request.getContextPath() + "/error.jsp");
		}
	}

}
