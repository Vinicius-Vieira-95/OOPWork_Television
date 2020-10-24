package entititie;

import java.util.ArrayList;
import java.util.List;

import exceptions.ExceptionChannel;

/*
 * Crie uma classe ControleRemoto que pode manipular uma lista de televisões, sejam elas
 * SmartTvs ou TVHDs (use polimorfismo, ou seja, considere todas do tipo Televisão),
 * ao mesmo tempo. Portanto, o controle tem como atributo a lista de TVs que ele controla.
 * Crie um método para adicionar TV, que recebe um objeto do tipo Televisão e o adiciona na lista de TVs apenas se a 
 * TV não estiver cadastrada. Se já estiver, dispare uma exceção de TV já cadastrada.
 * Essa classe também disponibiliza ao usuário as seguintes funcionalidades da TV por meio 
 * de métodos (que simulam os botões do controle físico): aumentar volume, diminuir
 *  volume, sintonizar canal específico, próximo canal, canal anterior, informar dados, e mostrar grade
 * 
 * 
 */

public class Controller {

	private List<Television> list = new ArrayList<>();

	private Television television;
	
	public Controller() {
		
	}

	public void addTv(Television tv) {
		for (Television t : list) {
			if (t.equals(tv)) {
				throw new ExceptionChannel("Tv is already registered");
			}
		}

		list.add(tv);
	}

	public List<Television> getList() {
		return list;
	}

	public void setList(List<Television> list) {
		this.list = list;
	}
	
	public Television getTelevision() {
		return television;
	}

	public void setTelevision(Television television) {
		this.television = television;
	}

	public void selectTV(String marca) {
		
		for(Television t : list ) {
			if(t.id.equalsIgnoreCase(marca)) {
				television = t;
			}
		}
	}
	
	public void UP() {
		television.volumeUp();
	}
	public void DOWN() {
		television.volumeDown();
	}
	public void registerChannels() {
		television.registerChannels();
	}
	public void changeChannel(String arg) {
		television.changeChannel(arg);
	}
	public void synChannel(int num) {
		television.synChannel(num);
	}
	public void showGrid() {
		television.Showgrid();
	}
	
	
}
