package pgk;

public class Doctor {
	private int doctorID;
	private String doctorPosition;
	private boolean availability;
	public Doctor(int doctorID1,String doctorPosition1,boolean availability1 )
	{
		doctorID=doctorID1;
		doctorPosition=doctorPosition1;
		availability=availability1;
		
	}
	public void displayInfo()
	{
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
