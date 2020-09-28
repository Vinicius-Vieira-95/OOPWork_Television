package aplication;

import java.util.Scanner;

import DesignTv.SmartTV;
import DesignTv.TVHD;
import entititie.RemoteControl;
import entititie.Television;
import exceptions.ExceptionChannel;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Television smartTV = new SmartTV(42,null, "LG");
		Television tvHD = new TVHD("Led", "Plasma", false, null, "TV133");
		
		int i = 0;
		
		while (i != 3){

			try {
				
				System.out.println(smartTV.toString());
				System.out.println(tvHD.toString());	
				
			}
			catch(ExceptionChannel e) {
				System.out.println(e.getMessage());
			}
			
			i = 3;

		}

		sc.close();
	}

}
