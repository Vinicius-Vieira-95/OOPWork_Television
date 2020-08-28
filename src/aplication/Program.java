package aplication;

import java.util.Scanner;

import entititie.Television;
import exceptions.ExceptionChannel;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Television tv = new Television(null);
		System.out.println("Volume atual: " + tv.getVol());
		int x = 0;
		int i = 0;
		tv.channelOrder();
		System.out.println(tv.getCurrentChannel());
		while (i != 3) {

			try {
				
				System.out.print("new Channel:");
				x = sc.nextInt();
				tv.synChannel(x);
				
				System.out.println(tv.getCurrentChannel());
				
				tv.changeChannel("Next");
				System.out.println("//////");
				System.out.println(tv.getCurrentChannel());
				
				tv.changeChannel("Previous");
				System.out.println("//////");
				System.out.println(tv.getCurrentChannel());
				
				tv.changeChannel("Next");
				System.out.println("//////");
				System.out.println(tv.getCurrentChannel());
				
			}
			catch(ExceptionChannel e) {
				System.out.println(e.getMessage());
			}
			

		}

		sc.close();
	}

}
