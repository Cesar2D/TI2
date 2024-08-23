package model;

public class X {
	
	private int code;
	private String login;
	private String password;
	private char s;
	
	public X() {
		this.code = -1;
		this.login = " ";
		this.password = " ";
		this.s = ' ';
	} // end default constructor
	
	public X(int code, String login, String password, char s) {
		this.code = code;
		this.login = login;
		this.password = password;
		this.s = s;
	} // end constructor()
	
	public int getCode() {
		return code;
	} // end getCode()
	
	public String getLogin() {
		return login;
	} // end getLogin()
	
	public String getPassword() {
		return password;
	} // end getPassword()
	
	public char getGender() {
		return s;
	} // end getGender()
	
	public void setCode(int code) {
		this.code = code;
	} // end setCode()
	
	public void setLogin(String login) {
		this.login = login;
	} // end setLogin()
	
	public void setPassword(String password) {
		this.password = password;
	} // end setPassword()
	
	public void setGender(char s) {
		this.s = s;
	} // end setCode()
	
	@Override
	public String toString() {
		return "Usuario [Codigo = " + code + "\n" + "Login = " + login + "\n" + "Senha = " + password + "\n" + "Sexo = " + s + "]"; 
	} // end toString()
}
