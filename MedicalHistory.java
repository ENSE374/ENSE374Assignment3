package a3;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class MedicalHistory extends Patient{
	private String medicalHistory;
	public MedicalHistory(String firstname, String lastname, String address, String email, int age, String phoneNumber,
			String password, String username, Boolean isOnline, int patientID1, String allergicDrugs1,
			String doctorNote1, String medicalForm1,String medicalHistory) {
		super(firstname, lastname, address, email, age, phoneNumber, password, username, isOnline, patientID1, allergicDrugs1,
				doctorNote1, medicalForm1);
		this.medicalHistory = medicalHistory;
	}

	public void searchMedicalHistory(Patient p) throws IOException
	{
		int searchingID = p.getPatientID();
		try {

			//You can change paths or filenames to make the Exception hit.
			Scanner in = new Scanner(Paths.get("Data.txt"));

			while (in.hasNextLine()) {
				String line = in.nextLine();
				String [] lineArray = line.split(",");
				if (Integer.parseInt(lineArray[0]) == searchingID)
				{
					setMedicalHistory(lineArray[1]);
				}
			}
			in.close();
			System.out.println("Successfully input data from a file...");
		}
		 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String history) {
		this.medicalHistory = history;
	}

}
