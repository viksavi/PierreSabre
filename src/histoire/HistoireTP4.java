package histoire;
import personnages.Humain;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		marco.faireConnasainceAvec(roro);
		marco.faireConnasainceAvec(yaku);
		marco.faireConnasainceAvec(chonin);
		marco.faireConnasainceAvec(kumi);
		marco.listerConnasaince();
		roro.listerConnasaince();
		yaku.listerConnasaince();
		
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		akimoto.faireConnasainceAvec(marco);
		akimoto.listerConnasaince();
		akimoto.boire("thé");
		
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		akimoto.faireConnasainceAvec(masako);
		masako.faireLeGentil();
		masako.faireConnasainceAvec(yaku);
		masako.faireLeGentil();
		masako.faireConnasainceAvec(roro);
	}

}