package eu.infostart.ejb.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import eu.infostart.ejb.entity.UserModel;

@Stateless
public class UserServiceImpl implements UserService {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public UserModel loginUser(String username, String password) {
		String sql = "Select model from UserModel model where model.username = :username and model.password = :password";
		
		Query q = entityManager.createQuery(sql);
		q.setParameter("username", username);
		q.setParameter("password", password);
		try {
			return (UserModel)q.getSingleResult();
		} catch (NoResultException ex) {
			return null;
		}
	}

	@Override
	public void SafeUser(UserModel user) {
		entityManager.persist(user);  // entityManager.merge(user) - for update
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserModel> getAllUsers() {
		String sql = "Select model from UserModel model order by model.id asc";
		Query q = entityManager.createQuery(sql);
		return q.getResultList();
	}

}
