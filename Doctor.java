package a3;

public class Doctor extends User{
	private int doctorID;
	private String doctorPosition;
	private boolean availability;
	public Doctor(String firstname, String lastname, String address, String email, int age,
			String phoneNumber, String password, String username, Boolean isOnline,int doctorID1,String doctorPosition1,boolean availability1 )
	{
		super(firstname, lastname, address, email, age, phoneNumber, password, username, isOnline);
		doctorID=doctorID1;
		doctorPosition=doctorPosition1;
		availability=availability1;
		
	}
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("doctorID is: " +doctorID);
		System.out.println("doctorPosition is: " +doctorPosition);
		
	}
	public int getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	public String getDoctorPosition() {
		return doctorPosition;
	}
	public void setDoctorPosition(String doctorPosition) {
		this.doctorPosition = doctorPosition;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	
	

}