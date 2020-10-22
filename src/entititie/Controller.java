package entititie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DesignTv.SmartTV;
import DesignTv.TVHD;

public class Controller extends Television {

	private List<TVHD> tvHDList = new ArrayList<>();
	private List<SmartTV> smartTVList = new ArrayList<>();

	private SmartTV smart;
	private TVHD hd;

	public Controller() {

	}

	public Controller(SmartTV smart) {
		this.smart = smart;
	}

	public Controller(TVHD hd) {
		this.hd = hd;
	}
	
	public void list(List<? extends Television> television) { // pega o tipo de array que erde de Televisão.

		for (Television tv : television) {
			System.out.println(tv.toString());
		}

	}

	@Override
	public void registerChannels() {
		// TODO Auto-generated method stub

	}

}
