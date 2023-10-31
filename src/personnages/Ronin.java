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
	
	public void provoquer(Yakuza adversaire)
	{
		int force = honneur * 2;
		
		if(force >= adversaire.getReputation())
		{
			String texte = "Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!\n";
			texte += "Je t’ai eu petit yakusa!";
			parler(texte);
			gagnerArgent(adversaire.perdre());
			honneur++;
		}
		else
		{
			String texte = "J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.";
			parler(texte);
			adversaire.gagner(getArgent());
			honneur--;
		}
	}
}
