package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Postgres {
	
	private final String URL = "jdbc:postgresql://localhost/Luma";
	private final String USER = "postgres";
	private final String PASSWORD = "admin";
	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Postgres app = new Postgres();
        app.connect();
		
		

	}
	
	public Connection connect() throws SQLException {
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(URL,USER,PASSWORD);
			
			if(connection != null) {
				
				System.out.println("Connected to the PostgreSQL server successfully.");
				
				Statement st = connection.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM shipping_cart_02");
				
				while(rs.next()){
					
					int idShipping = rs.getInt("idShipping");
	                String emailAddress = rs.getString("emailAddress");
	                String firstName = rs.getString("firstName");
	                String lastName = rs.getString("lastName");
	                String streetAddress = rs.getString("streetAddress");
	                String city = rs.getString("city");	
	                int zipCode = rs.getInt("zipCode");
	                String country = rs.getString("country");
	                String phoneNumber = rs.getString("phoneNumber");
	                String shippingMethod = rs.getString("shippingMethod");
	                
	                System.out.println(idShipping + "," + 
							emailAddress + "," + 
							firstName + "," + 
							lastName + "," + 
							streetAddress + "," + 
							city + "," + 
							zipCode + "," + 
							country + "," + 
							phoneNumber + "," + 
							shippingMethod);
					
				}
				rs.close();
				st.close();

				
			}else {
				
				 System.out.println("Failed to make connection!");
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return connection;
		
	}

}
