package controller;

public interface IAdapter {
	
	public String register (String phoneNumber , String password_1 , String password_2);
	public String signIn(String phoneNumber , String password);

}
