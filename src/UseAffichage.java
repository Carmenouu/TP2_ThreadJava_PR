
public class UseAffichage {

	semaphoreBinaire sb = new semaphoreBinaire(1) ;
	
	public void ecrire(String texte) {
		
		sb.syncWait();
		System.out.println("\nJ'entre en section critique") ;
		for (int i=0; i<texte.length(); i++){
			System.out.print(texte.charAt(i));
			try {Thread.sleep(100);} catch(InterruptedException e){};
		}
		System.out.println("\nJe sors de section critique") ;
		sb.syncSignal();
		
	}
}
