import java.util.*;

public class MainKlasse{
	
	public static void main(String[] args){
		Teilnehmer teilnehmer = new Teilnehmer("Nielab","nielab@haw-hamburg.de", "Student");
		
		Referenden ref1 = new Referenden("Hoschang", "hoschang@gmail.de", "InnoGames");
		Referenden ref2 = new Referenden("Max", "max@gmail.com", "Google");
				
		Workshopes ws1 = new Workshopes(22,03052013,"GoogleGames");
		Workshopes ws2 = new Workshopes(55,04052013,"InoGamesGames");

		Rahmenprogramm c = new Rahmenprogramm("Theater Besuch", 05052013, 1400, "Thalia Theater");
		
		ws1.addTeilnehmer(teilnehmer);
		ws2.addTeilnehmer(teilnehmer);
		rahmenprogramm.addTeilnehmer(teilnehmer);
		
	}
}