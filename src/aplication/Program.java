package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DesignTv.SmartTV;
import DesignTv.TVHD;
import entititie.Channel;
import entititie.Controller;
import entititie.Television;

public class Program {

	public static void main(String[] args) {

		/*
		 * 
		 * 6. Crie uma classe Principal na qual vários canais são criados (varie entre
		 * HDs e não HDs). Em seguida, crie pelo menos 2 TVs (uma de cada tipo), e
		 * cadastre os canais criados. Crie um objeto do controle remoto, associe a ele
		 * as TVs criadas, e ofereça ao usuário um menu com as opções disponíveis. Toda
		 * vez que o usuário escolhe uma opção, o método correspondente nas TVs é
		 * executado e o resultado é apresentado no console.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		Television smart = new SmartTV(50, channels(), "Samsung");
		Television tvhd = new TVHD("", "", true, channels(), "LG");
		
		
		Controller controle = new Controller();
		controle.addTv(smart);
		controle.addTv(tvhd);
		
		System.out.print("Escolha um Tv digitando o nome da marca: ");
		String marca = sc.next();
		controle.selectTV(marca);
		
		
		boolean flag = true;
		
		System.out.println("MENU DO CONTROLE");
		System.out.println("1 - proximo canal");
		System.out.println("2 - canal anterior");
		System.out.println("3 - sicronizar canal ");
		System.out.println("4 - volume UP ");
		System.out.println("5 - volume Down ");
		System.out.println("6 - adcionar canal");
		System.out.println("7 - Mostrar grade de canais");
		System.out.println("8 - Desligar ");
		
		while(flag) {
			System.out.print("Comando: ");
			int comando = sc.nextInt();
			
			switch(comando) {
			
			case 1:
				controle.getTelevision().changeChannel("next");
				break;
			case 2:
				controle.getTelevision().changeChannel("previous");
				break;
			case 3:
				System.out.print("numero do canal :");
				int num = sc.nextInt();
				controle.getTelevision().synChannel(num);
				break;
			case 4:
				controle.getTelevision().volumeUp();
				break;
			case 5:
				controle.getTelevision().volumeDown();
				break;
			case 6:
				System.out.print("Coloque o nome do canal: ");
				String nome = sc.next();
				System.out.print("Numero: ");
				int num2 = sc.nextInt();
				System.out.print("HD : ");
				boolean hd = sc.hasNext();
				controle.getTelevision().addChannel(new Channel(nome, num2, hd));
				break;
			case 7:
				controle.getTelevision().Showgrid();
				break;
			case 8:
				System.out.print("Coloque  a marca da tv :");
				String marca2 = sc.next();
				controle.selectTV(marca2);
				break;
			case 9:
				flag = false;
				break;
				
			}
			
			System.out.println();
			System.out.println(" ///DADOS ///");
			System.out.println("Canal atual: "+controle.getTelevision().getCurrentChannel());
			System.out.println("Volume: "+ controle.getTelevision().getVol());
		
		}
		
		sc.close();
	}
	

	public static List<Channel> channels() {

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
