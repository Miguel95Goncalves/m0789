package TPC161116;
import java.util.Random;

public class MediaDeGolos {
	
	public MediaDeGolos() {
		int[] panda = new int[3];
		int[] caricas = new int[3];
		int[] bob = new int[3];
		int[] pocoyo = new int[3];
		int golos,mediaPanda=0,mediaCaricas=0,mediaBob=0,mediaPocoyo=0,somaPanda=0,somaCaricas=0,somaBob=0,somaPocoyo=0;
		final int golosmax = 7;
		
		Random r = new Random();
		
		//Panda VS Caricas
		golos = r.nextInt(golosmax);
		panda[0] = golos;
		golos = r.nextInt(golosmax);
		caricas[0] = golos;
		System.out.println("Panda: "+panda[0]+" Caricas: "+caricas[0]);
		
		//Bob VS Pocoyo
		golos = r.nextInt(golosmax);
		bob[0] = golos;
		golos = r.nextInt(golosmax);
		pocoyo[0] = golos;
		System.out.println("Bob: "+bob[0]+" Pocoyo: "+pocoyo[0]);
		
		//Panda VS Bob
		golos = r.nextInt(golosmax);
		panda[1] = golos;
		golos = r.nextInt(golosmax);
		bob[1] = golos;
		System.out.println("Panda: "+bob[1]+" Bob: "+pocoyo[1]);
		
		//Caricas VS Pocoyo
		golos = r.nextInt(golosmax);
		caricas[1] = golos;
		golos = r.nextInt(golosmax);
		pocoyo[1] = golos;
		System.out.println("Caricas: "+bob[1]+" Pocoyo: "+pocoyo[1]);
		
		//Panda VS Pocoyo
		golos = r.nextInt(golosmax);
		panda[2] = golos;
		golos = r.nextInt(golosmax);
		pocoyo[2] = golos;
		System.out.println("Panda: "+panda[2]+" Pocoyo: "+pocoyo[2]);
		
		//Caricas VS Bob
		golos = r.nextInt(golosmax);
		caricas[2] = golos;
		golos = r.nextInt(golosmax);
		bob[2] = golos;
		System.out.println("Caricas: "+caricas[2]+" Bob: "+bob[2]);
		
		for (int i=0;i<3;i++) {
			somaPanda+=panda[i];
			somaCaricas+=caricas[i];
			somaBob+=bob[i];
			somaPocoyo+=pocoyo[i];
		}
		
		mediaPanda=somaPanda/3;
		mediaCaricas=somaCaricas/3;
		mediaBob=somaBob/3;
		mediaPocoyo=somaPocoyo/3;
		
		System.out.println("Media de golos da equipa Panda: "+mediaPanda);
		System.out.println("Media de golos da equipa Caricas: "+mediaCaricas);
		System.out.println("Media de golos da equipa Bob: "+mediaBob);
		System.out.println("Media de golos da equipa Pocoyo: "+mediaPocoyo);
		
	}

}
