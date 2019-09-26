package br.edu.imed;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

	public boolean insert(Product product) {
		String sql = "insert into products " + "(name, type, stock, price, locale, url_img) " + "values	(?, ?, ?, ?, ?, ?)";

		Connection connection = ConnectProducts.connect();

		PreparedStatement stmt;

		try {
			stmt = connection.prepareStatement(sql);

			stmt.setString(1, product.getName());
			stmt.setString(2, product.getType());
			stmt.setString(3, product.getStock());
			stmt.setString(4, product.getPrice());
			stmt.setString(5, product.getLocale());
			stmt.setString(6, product.getImage());

			stmt.execute();

			stmt.close();
			ConnectProducts.close(connection);

			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public List<Product> getProducts() {
		Connection connection = ConnectProducts.connect();

		try {
			PreparedStatement stmt = connection.prepareStatement("select * from products");

			ResultSet rs = stmt.executeQuery();

			List<Product> products = new ArrayList<Product>();

			while (rs.next()) {

				Product product = new Product();

				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setType(rs.getString("type"));
				product.setStock(rs.getString("stock"));
				product.setPrice(rs.getString("price"));
				product.setLocale(rs.getString("locale"));
				product.setImage(rs.getString("url_img"));

				products.add(product);
			}

			rs.close();
			stmt.close();
			ConnectProducts.close(connection);

			return products;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public boolean delete(int productId) {

		Connection connection = ConnectProducts.connect();

		try {
			PreparedStatement stmt = connection.prepareStatement("delete " + "from products where id=?");
			stmt.setInt(1, productId);
			stmt.execute();
			stmt.close();
			ConnectProducts.close(connection);
			return true;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public boolean update(Product product) {

		String sql = "update products set name=?, type=?, stock=?, price=?, locale=?, url_img=? where id=?";
		Connection connection = ConnectProducts.connect();
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, product.getName());
			stmt.setString(2, product.getType());
			stmt.setString(3, product.getStock());
			stmt.setString(4, product.getPrice());
			stmt.setString(5, product.getLocale());
			stmt.setString(6,product.getImage());
			stmt.setInt(7, product.getId());

			stmt.execute();

			stmt.close();
			ConnectProducts.close(connection);
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	public Product select(int id) {
		String sql = "select * from products where id=?";

		Connection connection = ConnectProducts.connect();

		PreparedStatement stmt;

		try {
			stmt = connection.prepareStatement(sql);

			stmt.setInt(1, id);

			stmt.execute();

			ResultSet rs = stmt.executeQuery();
			Product product = new Product();

			product.setId(rs.getInt("id"));
			product.setName(rs.getString("name"));
			product.setType(rs.getString("type"));
			product.setStock(rs.getString("stock"));
			product.setPrice(rs.getString("price"));
			product.setLocale(rs.getString("locale"));
			product.setImage(rs.getString("url_img"));
			
			stmt.close();
			ConnectProducts.close(connection);

			return product;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
