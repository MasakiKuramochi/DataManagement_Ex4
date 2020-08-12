package work;

import java.util.Random;


public class HeadsOrTails {
	 public static void main(String[] args) {
		 Random r = new Random();
		 int h=0, t=0;
		 System.out.println("Tossing a coin...");
		 for(int i=0 ; i<3 ; i++) {
			 String s;
		      if(r.nextInt(2)==0) {
		    	  s="Heads";
		    	  h++;
		      }else {
		    	  s="Tails";
		    	  t++;
		      }
		      System.out.println("Round "+i+": "+s);
		    }
		 System.out.println("Heads: "+h+", Tails: "+t);
	 }
}
