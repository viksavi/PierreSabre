package personnages;

import java.util.Random;

public class Traitre extends Samourai{
	private int niveauTraitrise;
	
	public Traitre( String seigneur, String nom, String boissonFavorite, int argent)
	{
		super(seigneur, nom, boissonFavorite, argent);
		this.niveauTraitrise = 0;
	}
	
	@Override
	public void direBonjour()
	{
		String result = "Bonjour! Je m’appelle " + this.getNom() + " et j’aime boire du " + this.getBoissonFavorite();
		result += "\nJe suis fier de servir le seigneur " + this.getSeigneur();
		result += "\nMais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut !";
		parler(result);
	}
	
	public void ranconner(Commercant commercant)
	{
		if(niveauTraitrise < 3)
		{
			int argentCommercant = commercant.getArgent();
			int argentRanconner = (argentCommercant * 2) / 10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			niveauTraitrise++;
			
			String texte1 = "Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi ";
			texte1 += argentRanconner + " sous ou gare à toi !";
			this.parler(texte1);
			commercant.parler("Tout de suite grand " + this.getNom() + ".");
			
		}
		else
		{
			this.parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
			
		}
	}
	
	public void faireLeGentil()
	{
		if(nbConnasaince < 1)
		{
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif");
		}
		else
		{
			int randomHumain = new Random().nextInt(nbConnasaince);
			Humain ami = this.memoire[randomHumain];
			int don = (this.getArgent() * 1) / 20;
			
			String nomAmi = ami.getNom();
			String texte1 = "Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi;
			this.parler(texte1);
			this.parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			ami.gagnerArgent(don);
			this.perdreArgent(don);
			String nom = this.getNom();
			ami.parler("Merci " + nom + " Vous êtes quelqu'un de bien");
			
			if(niveauTraitrise > 1)
			{
				niveauTraitrise--;
			}
		}
	}
}
