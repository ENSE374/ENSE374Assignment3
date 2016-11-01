package a3;

public class User {
	private String firstname;
	private String lastname;
	private String address;
	private String email;
	private int age;
	private String phoneNumber;
	private String password;
	private String username;
	private boolean isOnline;
	
	public User (String firstname, String lastname, String address, String email, int age,
			String phoneNumber, String password, String username, Boolean isOnline )
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.email = email;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.username = username;
		this.isOnline = isOnline;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public boolean isOnline() {
		return isOnline;
	}
	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}
	public void displayInfo(){
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(address);
		System.out.println(email);
		System.out.println(age);
		System.out.println(phoneNumber);
		System.out.println(password);
		System.out.println(username);

		
	}
}
