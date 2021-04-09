package poke_tour;
import poke_tour.Ratata;
import poke_tour.Racaillou;

public class main {

	public static void main(String[] args) {
		start_tournoi();
}
	
	public static void start_tournoi() {// lance le tournoi
		Racaillou Ra= new Racaillou(10,10);//instances de pokemons
		Ratata Ham = new Ratata(15,6);
		Ratata Pom = new Ratata(12,8);
		Racaillou LLou= new Racaillou(20,20);
		//def des equipes
		Pokemon d1[]= {Ra,Ham};
		Pokemon d2[]= {Pom,LLou};
		System.out.println("\n#######\tdebut du tournoi !!!! ########\n");
		tournoi(d1,d2);
	}
	public static void tournoi(Pokemon [] g1, Pokemon [] g2) {// défini le combat
		for(int i=0;i <g1.length;i++) {
			for(int k=0;k <g2.length;k++) {
				while(g2[k].pv !=0 || g1[i].pv !=0) {
					g1[i].attaque(g2[k]);
					System.out.println("\t####Au tour de l'adversaire ####");
					g2[i].attaque(g1[i]);
				}
			}	
		}
	System.out.print( "\n$$$$$$$\tfin du tournoi $$$$$$$") ;
	}
}
