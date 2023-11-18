package personnages;

import java.util.Random;

public class GrandMere extends Humain{
	private TypeHumain[] types = TypeHumain.values();
	
	public GrandMere(String nom, int argent)
	{
		super(nom, "tisane", argent);
	}
	
	@Override
	protected void memoriser(Humain humain)
	{
		if(nbConnasaince < 5)
		{
			this.memoire[nbConnasaince] = humain;
			nbConnasaince++;
		}
		else
		{
			String texte = "Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !";
			parler(texte);
		}
		
	}
	
	private String humainHasard()
	{
		int humainRandom = new Random().nextInt(this.nbConnasaince);
		return types[humainRandom].toString();
	}
	
	public void ragoter()
	{
		for(int i = 0; i < nbConnasaince; i++)
		{
			Humain humainFriend = this.memoire[i];
			String humain = humainHasard();
			if(humainFriend instanceof Traitre) {
				System.out.println("Je sais que " + humainFriend.getNom() + " est un traître. Petit chenapan !");
			}
			else {
				System.out.println("Je sais que " + humainFriend.getNom() + " est un " + humain);
			}
		}
	}
}
