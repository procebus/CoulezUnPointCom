package app1_versionSimple;

public class SimplePointCOM {

	int[] cellules;
	int nbTouches=0;
	
	String autoVerif(String stringPropo)
	{
		
		//lire la proposition de l'user ss forme de chaine
		
		
		//convertir la chaine en entier
		int propo = Integer.parseInt(stringPropo);
		String resultat ="manqué"; // creer var de resultat initialisé à "manqué"
		
		//repeter pour chaque cellule du tableau 
		//for (int cellules : cellules){
		for (int i = 0; i < cellules.length; i++) {
			
				if(propo == cellules[i]) {
					resultat= "touché";
					nbTouches++;
					break;
				}
		}
		if(nbTouches == cellules.length){
			resultat = "coulé";
		}
		
		System.out.println(resultat);
		return resultat;
			
			//comparer la proposition a l'emplacement de la cellule 
				//si propo fait mouche 
					//incrementer le nbre de touches
					//determiner si c'est la 1 ere cellule :
						//si nbretouches = 3 -> return "coulé"
					//sinon ce n'est pas coulé  -> return "touché"
				//finSI
			//Sinon la propo ne correspond pas , -> return "manqué"
			//finSI
		//fin repeter
		
		
	}
	
	public void setCellules(int[] plc)
	{
		//lire l'emplacement dans le tableau d'entiers
		//affecter le parametre emplacement à la variable d'instance emplacement
		cellules = plc;
	}
	
	
	
}
