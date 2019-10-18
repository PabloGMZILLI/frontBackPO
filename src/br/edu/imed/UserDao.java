package br.edu.imed;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

	public boolean insert(User user) {
		String sql = "insert into users " + "(name, login, email, phone, password) " + "values	(?, ?, ?, ?, ?)";

		Connection connection = Connect.connect();

		PreparedStatement stmt;

		try {
			stmt = connection.prepareStatement(sql);

			stmt.setString(1, user.getName());
			stmt.setString(2, user.getLogin());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPhone());
			stmt.setString(5, user.getPassword());

			stmt.execute();

			stmt.close();
			Connect.close(connection);

			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public List<User> getUsers() {

		Connection connection = Connect.connect();

		try {
			PreparedStatement stmt = connection.prepareStatement("select * from users");

			ResultSet rs = stmt.executeQuery();

			List<User> users = new ArrayList<User>();

			while (rs.next()) {

				User user = new User();

				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setLogin(rs.getString("login"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				user.setPassword(rs.getString("password"));

				users.add(user);
			}

			rs.close();
			stmt.close();
			Connect.close(connection);

			return users;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public boolean delete(int userId) {

		Connection connection = Connect.connect();

		try {
			PreparedStatement stmt = connection.prepareStatement("delete " + "from users where id=?");
			stmt.setInt(1, userId);
			stmt.execute();
			stmt.close();
			Connect.close(connection);
			return true;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public boolean update(User user) {

		String sql = "update users set name=?, login=?, email=?, phone=? where id=?";
		Connection connection = Connect.connect();
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getLogin());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPhone());
			stmt.setInt(5, user.getId());

			stmt.execute();

			stmt.close();
			Connect.close(connection);
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
	public User select(int id) {
		String sql = "select * from users where id=?";

		Connection connection = Connect.connect();

		PreparedStatement stmt;

		try {
			stmt = connection.prepareStatement(sql);

			stmt.setInt(1, id);

			stmt.execute();

			ResultSet rs = stmt.executeQuery();
			User user = new User();

			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setLogin(rs.getString("login"));
			user.setEmail(rs.getString("email"));
			user.setPhone(rs.getString("phone"));
			user.setPassword(rs.getString("password"));

			stmt.close();
			Connect.close(connection);
		
			return user;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

public Boolean login(String login, String password) {
	String sql = "select * from users where login=? and password=? ";

	Connection connection = Connect.connect();

	PreparedStatement stmt;

	try {
		stmt = connection.prepareStatement(sql);

		stmt.setString(1, login);
		stmt.setString(2, password);
		
		stmt.execute();

		ResultSet rs = stmt.executeQuery();
		stmt.close();
		Connect.close(connection);
	
		return true;

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;

}

}