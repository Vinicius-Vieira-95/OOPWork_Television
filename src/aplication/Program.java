package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DesignTv.SmartTV;
import entititie.Channel;
import entititie.Television;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Television smart = new SmartTV(50, channels(), "Samsung");
		
		smart.Showgrid();

		System.out.println(smart.getCurrentChannel());
		
		sc.close();
	}
	
	
	public static List<Channel> channels(){
		
		List<Channel> channels = new ArrayList<Channel>();
		
		channels.add(new Channel("BBC", 13, true));
		channels.add(new Channel("Globo", 10, true));
		channels.add(new Channel("SBT", 12, false));
		channels.add(new Channel("Band", 20, false));
		channels.add(new Channel("Record", 8, true));
		channels.add(new Channel("RedeTv", 2, true));
		channels.add(new Channel("TvMetropole", 16, false));
		channels.add(new Channel("RedeUnião", 17, true));
		channels.add(new Channel("TvDiario", 22, true));
		channels.add(new Channel("TvAparecida", 19, false));
		
		return channels;
		
	}

}
