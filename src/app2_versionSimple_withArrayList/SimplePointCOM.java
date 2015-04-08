package app2_versionSimple_withArrayList;

import java.util.ArrayList;

public class SimplePointCOM {

	private ArrayList<String> cellules;
	// on remplace notre tableau int[] cellules; par une arrayliste cellules de type String 
	//int nbTouches=0;
	
	public void setCellules(ArrayList<String> places){
		cellules=places;
	}
	
	public String autoVerif(String propoUtil)
	{
		//int propo = Integer.parseInt(stringPropo); plus utile 
		String resultat ="manqué"; 
		//determiner si la cellule saisi par l'utilisateur est dans l'arraylist en demandant 
		// son indice . is nok , indexOf return -1
		int indice = cellules.indexOf(propoUtil);
		// si indice >= 0, la cellule proposée est dans la liste 
		if(indice >= 0){ 
			cellules.remove(indice); // on la supprime
			if (cellules.isEmpty()) { // si liste vide , coup de grace
				resultat="coulé";
			}
			else {
				resultat="touché";
			}
		}
		
		return resultat;
		
	
	}	
	
	
}
