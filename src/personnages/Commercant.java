package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom, int argent)
	{
		super(nom, "the", argent);
	}
	
	public int seFaireExtorquer()
	{
		String texte = "J’ai tout perdu! Le monde est trop injuste...";
		parler(texte);
		int somme = getArgent();
		perdreArgent(somme);
		return somme;
	}
	
	public void recevoir(int argent)
	{
		String texte = argent + " sous! ";
		texte += "Je te remercie généreux donateur";
		parler(texte);
		gagnerArgent(argent);
	}
}
