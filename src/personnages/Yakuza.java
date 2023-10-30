package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan)
	{
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime)
	{
		String nomVictime = victime.getNom();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(nomVictime + ", si tu tiens à la vie donne moi ta bourse !");
		int argent = victime.seFaireExtorquer();
		gagnerArgent(argent);
		reputation++;
		parler("J'ai piqué les " + argent + " sous de " + nomVictime + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi! Hi!");
	}
}
