package observerPattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direktion dir = new Direktion();
		Sekretariat sek = new Sekretariat();
		Lehrer m = new Lehrer("Maier");
		
		Observable o = new Observable();
		o.addObserver(dir);
		o.addObserver(sek);
		o.addObserver(m);
		
		Scanner s = new Scanner(System.in);
		while(true)	{
			String input = s.next();
			try {
				int value = Integer.parseInt(input);
				o.changeValue(value);
			} catch (NumberFormatException e) {
				if(input.equals("Stop"))	{
					break;
				} else	{
					System.out.println("Unzulässige Eingabe.");
				}
			}
			System.out.println();
			System.out.println();
		}
		s.close();
	}

}
