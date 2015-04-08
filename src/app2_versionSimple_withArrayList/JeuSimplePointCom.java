package app2_versionSimple_withArrayList;

import java.util.ArrayList;

public class JeuSimplePointCom {

	public static void main(String[] args) {

		int nbPropo=0;
		Gamehelper helper = new Gamehelper();
		SimplePointCOM lePointCom = new SimplePointCOM();
		int randomNum = (int) (Math.random() * 5);
		String randomposition1 =  Integer.toString(randomNum);
		String randomposition2 =  Integer.toString(randomNum+1);
		String randomposition3 =  Integer.toString(randomNum+2);
		ArrayList<String> places = new ArrayList<>();
		places.add(randomposition1);
		places.add(randomposition2);
		places.add(randomposition3);
		lePointCom.setCellules(places);
		
		boolean estVivant = true;
		while (estVivant == true) {
			String propo = helper.getPropoUtil("tapez un chiffre");
			String resultat =lePointCom.autoVerif(propo);
			nbPropo++;
			if(resultat.equals("coulé")){
				estVivant=false;
				System.out.println("trop long "+ nbPropo +" coups");
			}
			
			
		}
		
		
		
	}

}
