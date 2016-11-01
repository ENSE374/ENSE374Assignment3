package a3;

public class Patient extends User {
	
	private int patientID;
	private String allergicDrugs;
	private String doctorNote;
	private String medicalForm;
	
	public Patient(String firstname, String lastname, String address, String email, int age,
			String phoneNumber, String password, String username, Boolean isOnline, int patientID1,String allergicDrugs1,String doctorNote1,String medicalForm1)
	{
		super(firstname, lastname, address, email, age, phoneNumber, password, username, isOnline);
		patientID=patientID1;
		setAllergicDrugs(allergicDrugs1);
		setDoctorNote(doctorNote1);
		setMedicalForm(medicalForm1);
	}
	
	public int getPatientID()
	{
		return patientID;
	}
	
	public int getdoctorNote()
	{
		return patientID;
	}
	
	public String getAllergicDrugs() {
		return allergicDrugs;
	}

	public void setAllergicDrugs(String allergicDrugs) {
		this.allergicDrugs = allergicDrugs;
	}

	public String getMedicalForm() {
		return medicalForm;
	}

	public void setMedicalForm(String medicalForm) {
		this.medicalForm = medicalForm;
	}

	public String getDoctorNote() {
		return doctorNote;
	}

	public void setDoctorNote(String doctorNote) {
		this.doctorNote = doctorNote;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Patient ID: "+patientID);
		System.out.println("Allergic Drugs: "+allergicDrugs);
		System.out.println("Medical Form: "+medicalForm);
		System.out.println("Doctor Note: "+doctorNote);
	}
}
