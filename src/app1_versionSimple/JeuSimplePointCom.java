package app1_versionSimple;



public class JeuSimplePointCom {

	public static void main(String[] args) {

		int nbPropo=0;
		Gamehelper helper = new Gamehelper();
		SimplePointCOM lePointCom = new SimplePointCOM();
		int randomNum = (int) (Math.random() * 5);
		int[] places = {randomNum,randomNum+1,randomNum+2};
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
