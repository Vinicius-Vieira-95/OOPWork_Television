package aplication;

import java.util.Scanner;

import entititie.Channel;
import entititie.Television;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Television tv = new Television(null);
		System.out.println("Volume atual" + tv.getVol());
		//int i = 0;
		
			
			System.out.println("Seach channels");
			Channel ch = new Channel("Globo", 10, true);
			
			tv.existingChannel(ch);
			
		
		
		sc.close();
	}

}
