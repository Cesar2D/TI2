package dao;

import java.sql.*;

public class XDAO {

	private Connection conect;

	public XDAO() {
		conect = null;
	} // end standart constructor()

	public boolean conect() {

		String driverName = "org.postgresql.Driver";
		String serverName = "localhost";
		String myDatabase = "usuario";

		int porta = 5432;

		String url = "jdbc:postgresql://" + serverName + ":" + porta + "/" + myDatabase;
		String username = "ti2cc";
		String password = "ti@cc";
		boolean status = false;

		try {
			Class.forName(driverName);
			conect = DriverManager.getConnection(url, username, password);
			status = (conect == null);
			System.out.println("Conexao efetuada com o postgress!");
		} catch (ClassNotFoundException e) {
			System.err.println("Conexao NAO efetuada com o postgress - Driver nao encontrado " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("Conexao NAO efetuada com o postgres " + e.getMessage());
		}

		return status;
	} // end conect()

	public boolean close() {
		boolean status = false;

		try {
			conect.close();
			status = true;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

		return status;
	} // end close()

	/*
	 * public boolean inserirUsuario(Usuario usuario) {
	 * boolean
	 * 
	 * } // end inserirUsuario()
	 */

}
