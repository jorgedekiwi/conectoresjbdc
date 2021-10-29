package com.add2.conectores;
import java.sql.*;
public class ConsultarDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("SIU");
		System.out.print("SIU2");
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jugadores","root","clasedam1");
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from alumnos");
			while(rs.next())
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			con.close();
		}catch (SQLException e) {
			System.out.print(e);
		}
	}

}
