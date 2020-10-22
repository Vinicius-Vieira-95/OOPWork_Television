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

public class Controller extends Television{

	private List<Television> list = new ArrayList<>();

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

	@Override
	public void registerChannels() {
		// TODO Auto-generated method stub
		
	}
	
}
