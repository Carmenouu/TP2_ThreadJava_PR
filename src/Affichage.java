import java.io.*;
import java.lang.String;


//class Exclusion {};

public class Affichage extends Thread{
	String texte; 
	//static Exclusion exclusionImpression = new Exclusion() ;
	//UseAffichage useAffichage ;
	static semaphoreBinaire sb = new semaphoreBinaire(1) ;
	
	public Affichage (/*UseAffichage u,*/String txt){
		//useAffichage=u;
		texte=txt;
	}
	
	public void run(){
		/*synchronized (exclusionImpression) {
			for (int i=0; i<texte.length(); i++){
				System.out.print(texte.charAt(i));
				try {sleep(100);} catch(InterruptedException e){};
			}
		}*/	
		
		
		sb.syncWait();
		System.out.println("\nJ'entre en section critique") ;
		for (int i=0; i<texte.length(); i++){
			System.out.print(texte.charAt(i));
			try {sleep(100);} catch(InterruptedException e){};
		}
		System.out.println("\nJe sors de section critique") ;
		sb.syncSignal();
	}
}
