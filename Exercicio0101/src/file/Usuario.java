package file;

import java.util.*;

public class Usuario {
	
	int codigo; 
	String login;
	String senha; 
	char sexo;
	
	/*----- constructor -----*/
	// standart constuctor 
	public Usuario(){
		this.codigo = -1; this.login = "";
		this.senha = ""; this.sexo = '*';
	}
	
	// generic constructor
	public Usuario(int codigo, String login, String senha, char sexo) {
		
		this.codigo = codigo; this.login = login; 
		this.senha  = senha;  this.sexo = sexo;
	}
	
	// object create
	public static Scanner sc = new Scanner(System.in);
	
	/*----- get/set -----*/
	public static Scanner getSc() {
		return sc;
	}

	public static void setSc(Scanner sc) {
		Usuario.sc = sc;
	}

	/*----- toString -----*/
	@Override
	public String toString() {
		return "Usuario [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
