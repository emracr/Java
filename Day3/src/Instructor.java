
public class Instructor extends Person{
	
	private String _userName;
	private String _password;
	private String _email;
	private String _phoneNumber;
	private String[] _profession;
	
	public String getUserName() {
		return _userName;
	}
	public void setUserName(String userName) {
		_userName = userName;
	}
	public String getPassword() {
		return _password;
	}
	public void setPassword(String password) {
		_password = password;
	}
	public String getEmail() {
		return _email;
	}
	public void setEmail(String email) {
		_email = email;
	}
	public String getPhoneNumber() {
		return _phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}
	public String[] getProfession() {
		return _profession;
	}
	public void setProfession(String[] profession) {
		_profession = profession;
	}
	
}
