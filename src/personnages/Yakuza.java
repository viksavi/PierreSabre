package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan)
	{
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public int getReputation()
	{
		return reputation;
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
	
	public int perdre()
	{
		int argentPerdu = getArgent();
		perdreArgent(argentPerdu);
		reputation--;
		String texte = "J’ai perdu mon duel et mes " + argentPerdu + " sous, snif... ";
		texte += "J'ai déshonoré le clan de " + clan;
		parler(texte);
		return argentPerdu;
	}
	
	public void gagner(int gain)
	{
		gagnerArgent(gain);
		reputation++;
		String texte = "Ce ronin pensait vraiment battre " + getNom() + "du clan de " + clan + "? ";
		texte += "Je l'ai dépouillé de ses " + gain + " sous.";
		parler(texte);
	}
	
	@Override
	public void direBonjour()
	{
		String result = "Bonjour! Je m’appelle " + this.getNom() + " et j’aime boire du " + this.getBoissonFavorite();
		result += "\nMon clan est celui de " + clan;
		parler(result);
	}
}
