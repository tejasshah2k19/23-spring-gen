package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.UserBean;

@Repository
public class UserDao {

	@Autowired // JdbcTemplate -> create instance -> singleton
	JdbcTemplate stmt;// instance variable

	public void addUser(UserBean user) {
		// insert update delete
		stmt.update("insert into users (firstName,email,password) values (?,?,?)", user.getFirstName(), user.getEmail(),
				user.getPassword());
	}

	public List<UserBean> getAllUsers() {
		// UserBean -> firstName | row map
		List<UserBean> users = stmt.query("select * from users", new BeanPropertyRowMapper<>(UserBean.class));
		return users;
	}

	public void deleteUser(Integer userId) {
		stmt.update("delete from users where userId = ? ", userId);
	}

	public UserBean getUserById(Integer userId) {
		return stmt.queryForObject("select * from users where userId = ? ", new BeanPropertyRowMapper<>(UserBean.class),
				new Object[] { userId });
	}

	public void updateUser(UserBean user) {
		stmt.update("update users set firstName = ? , email = ? where userId = ?",user.getFirstName(),user.getEmail(),user.getUserId());
	}
}
//UserDao userDao = new UserDao();

//@Autowired
//UserDao userDao;

//@Controller - controller  
//@Repository - db 
//@Component - generic 
//@Service  - logic 
