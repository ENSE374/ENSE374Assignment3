package a3;

public class Admin extends User{
	private int AdminID;
	private String AdminRole;
	
	public Admin(String firstname, String lastname, String address, String email, int age,
			String phoneNumber, String password, String username, Boolean isOnline, int AdminID, String AdminRole)
	{
		super(firstname, lastname, address, email, age, phoneNumber, password, username, isOnline);
		this.AdminID = AdminID;
		this.AdminRole = AdminRole;
	}
	public int getAdminID() {
		return AdminID;
	}
	public void setAdminID(int adminID) {
		AdminID = adminID;
	}
	public String getAdminRole() {
		return AdminRole;
	}
	public void setAdminRole(String adminRole) {
		AdminRole = adminRole;
	}
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Admin ID: "+AdminID);
		System.out.println("Admin Role: "+AdminRole);
	}

}
