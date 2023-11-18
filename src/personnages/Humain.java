package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected int nbConnasaince = 0;
	protected Humain[] memoire = new Humain[30];
	
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
	
	protected String getBoissonFavorite()
	{
		return boissonFavorite;
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
	
	protected void parler(String texte)
	{
		System.out.println(texte);
	}
	
	private void repondre(Humain humain)
	{
		humain.direBonjour();
	}
	
	protected void memoriser(Humain humain)
	{
		if(nbConnasaince < this.memoire.length)
		{
			this.memoire[nbConnasaince] = humain;
			nbConnasaince++;
		}
		
	}
	
	public void faireConnasainceAvec(Humain humain)
	{
		this.direBonjour();
		this.repondre(humain);
		humain.memoriser(this);
		this.memoriser(humain);
		
	}
	
	public void listerConnasaince()
	{
		System.out.println("Je connais beaucoup de monde dont :");
		for(int i = 0; i < nbConnasaince; i++)
		{
			System.out.println(this.memoire[i].getNom());
		}
		
	}
}
