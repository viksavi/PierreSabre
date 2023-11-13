package personnages;

public class Samourai extends Humain{
	private String seigneur;
	
	public Samourai( String seigneur, String nom, String boissonFavorite, int argent)
	{
		super(nom, boissonFavorite, argent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour()
	{
		String result = "Bonjour! Je m’appelle " + this.getNom() + " et j’aime boire du " + this.getBoissonFavorite();
		result += "\nJe suis fier de servir le seigneur " + seigneur;
		parler(result);
	}
	
	public void boire(String boisson)
	{
		String texte = "Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson;
		parler(texte);
	}
}
