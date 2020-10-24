package entititie;

import java.util.ArrayList;
import java.util.List;

import exceptions.ExceptionChannel;

/*
 * Crie uma classe ControleRemoto que pode manipular uma lista de televis�es, sejam elas
 * SmartTvs ou TVHDs (use polimorfismo, ou seja, considere todas do tipo Televis�o),
 * ao mesmo tempo. Portanto, o controle tem como atributo a lista de TVs que ele controla.
 * Crie um m�todo para adicionar TV, que recebe um objeto do tipo Televis�o e o adiciona na lista de TVs apenas se a 
 * TV n�o estiver cadastrada. Se j� estiver, dispare uma exce��o de TV j� cadastrada.
 * Essa classe tamb�m disponibiliza ao usu�rio as seguintes funcionalidades da TV por meio 
 * de m�todos (que simulam os bot�es do controle f�sico): aumentar volume, diminuir
 *  volume, sintonizar canal espec�fico, pr�ximo canal, canal anterior, informar dados, e mostrar grade
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
