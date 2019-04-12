import java.io.*;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.lang.String;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//UseAffichage ua = new UseAffichage() ;
		Affichage TA = new Affichage(/*ua,*/ "AAA");
		Affichage TB = new Affichage(/*ua,*/ "BB");

		TB.start();

		TA.start();
	}

}
