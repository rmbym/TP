package poke_tour;

public class Pokemon {
	protected String nomPoke,cri,criV,criD;// 
	protected int pv, pp;
	
	public Pokemon(String pnomPoke, int pPV,int pPP) {//constr
		System.out.println("creation d'un pokemon !");
		nomPoke=pnomPoke;pv=pPV;pp=pPP;this.setCri();this.setCriV();this.setCriD();
		//System.out.println(this.Desc());
	}
	
	public String getNomPoke(){return nomPoke;}
	public String cri(){return cri;}
	public int getNPV(){return pv;}
	public int getNPP(){return pp;}
	public String getCriV() {return criV;}
	public String getCriD() {return criD;}
	///////////////////mutateurs/////////////////
	public void setNomPoke(String pnomPoke) {nomPoke=pnomPoke;this.setCri();}
	protected void setCriV(){criV="Yay";}
	protected void setCriD(){criD="Nooo";}
	public void setNPV(int pPV) {pv=pPV;}
	public void setNPP(int pPP) {pp=pPP;}
	protected void setCri() {cri="unknown";}// 
	
	public int attaque(Pokemon b) {
		System.out.println(this.nomPoke+" lance une attaque !");
		System.out.println(b.nomPoke+" subit "+this.pp+" de degats !");
		b.pv -= this.pp;
		if(b.pv <=0) {
			System.out.println(b.nomPoke+" est KO , son cri de defaite :"+b.getCriD());
			b.pv=0;
			System.out.println(this.nomPoke+" est victorieux, son cri de victoire :"+this.criV);
			}
		else {
			System.out.println(b.nomPoke+" a "+b.pv+" PV restants !");}
		return b.pv;
	}
}

