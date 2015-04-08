package app1_versionSimple;

public class SimplePointComTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SimplePointCOM spc = new SimplePointCOM();
			int [] places ={2,3,4};
			spc.setCellules(places);
			String propoUtil ="4";
			String resultat = spc.autoVerif(propoUtil);
			/*String resulatTest = "raté";
			if (resultat.equals("touché")) {
				resulatTest = "réussi";
			}
			System.out.println(resulatTest);*/
			
			
			
	}		

}
