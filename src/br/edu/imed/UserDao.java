package br.edu.imed;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Respons�vel por executar comandos SQL (Insert, Delete, Update e Select)
 * Convertendo registros de banco relacional para objetos.
 */
public class UserDao {

	public boolean insert(User user) {
		String sql = "insert into users " + 
				"(name, login, email, phone, password) " + 
				"values	(?, ?, ?, ?, ?)";

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

		return false;
	}
	
}
