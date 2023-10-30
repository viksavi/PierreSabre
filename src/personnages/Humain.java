package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	public void direBonjour()
	{
		String result = "Bonjour! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite;
		parler(result);
	}
	
	public void boire()
	{
		String result = "Mmmm, un bon verre de " + boissonFavorite + " GLOUPS !";
		parler(result);
	}
	
	public void acheter(String bien, int prix)
	{
		String result = "";
		if(prix <= argent)
		{
			result = "J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir ";
			result += bien + " à " + prix + " sous";
			perdreArgent(prix);
		}
		else
		{
			result = "Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir ";
			result += bien + " à " + prix + " sous";
		}
		parler(result);
	}
	
	public void gagnerArgent(int gain)
	{
		argent += gain;
	}
	
	public void perdreArgent(int perte)
	{
		argent -= perte;
	}
	
	private void parler(String texte)
	{
		System.out.println(texte);
	}
}
