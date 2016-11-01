package a3;

import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		Patient p = new Patient("david", "huo", "address","email",12,"123-456-7890","password","username",true,
				123456,"drugs","note","form");
		p.displayInfo();
		System.out.println("\n");
		
		Doctor d = new Doctor("jin", "chen", "address","email",12,"123-456-7890","password","username",true,
				123456,"pos",true);
		d.displayInfo();
		System.out.println("\n");
		
		Admin a = new Admin("jin", "chen", "address","email",12,"123-456-7890","password","username",true,
				123456,"pos");
		a.displayInfo();
		System.out.println("\n");
		
		MedicalHistory m = new MedicalHistory("david", "huo", "address","email",12,"123-456-7890","password","username",true,
				123456,"drugs","note","form","UNKNOWN");
		m.searchMedicalHistory(p);
	}

}
