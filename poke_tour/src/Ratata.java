package poke_tour;

public class Ratata extends Pokemon{

	public Ratata( int pPV, int pPP) {//cons
		super("ratata", pPV, pPP);
		System.out.println(this.Desc());
		this.setCri();
	}
	public String getNom(){ return this.nomPoke; }
	//private void setNom(String pnomPoke) { pnomPoke="Ratata";}// no need
	
	public String getCri(){ return this.cri; }
	protected void setCri() {this.cri=" tatatatataaaa !!";}
	
//the desc of the pokemon
	public String Desc(){
	    return this.nomPoke+" a "+this.pv+ " PV ,"+this.pp+" PP , son cri est "+this.cri+" !!";
	  }
}
