package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int argent)
	{
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiare)
	{
		int argentDonne = (getArgent()*10)/100;
		perdreArgent(argentDonne);
		parler(beneficiare.getNom() + " prend ces " + argentDonne + " sous.");
		beneficiare.recevoir(argentDonne);
	}
}
