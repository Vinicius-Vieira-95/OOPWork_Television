package entititie;

import java.util.ArrayList;
import java.util.List;

import exceptions.ExceptionChannel;

public abstract class Television {

	protected String id;
	protected Integer vol;
	protected Channel currentChannel;

	static final Integer UP = 1;
	static final Integer DOWN = 1;

	private static final Integer volMax = 10;
	private static final Integer volMin = 0;

	protected List<Channel> channels = new ArrayList<>();
	
	public Television() {
		
	}
	
	public Television(List<Channel> channels, String id){
		
		this.id = id;
		this.vol = 5;
		this.channels = channels;
		channelOrder();
	}

	public Integer getVol() {
		return vol;
	}

	public void setVol(Integer vol) {
		this.vol = vol;
	}

	public Channel getCurrentChannel() {
		return currentChannel;
	}

	// Gerar Ordem dos canais pegando o numero do canal
	public void channelOrder() {
		channels.sort((c1, c2) -> c1.getNumber().compareTo(c2.getNumber()));
		// System.out.println(channels);
	}

	public int volumeUp() {

		if (vol < volMax) {
			return this.vol += UP;
		} else {
			return vol;
		}
	}

	public int volumeDown() {

		if (vol > volMin) {
			return vol -= DOWN;
		} else {
			return vol;
		}
	}

	// abstract
	public abstract void registerChannels();

	public boolean existingChannel(Channel ch) {

		for (Channel c : channels) {
			if (c.getNumber().equals(ch.getNumber())) {
				System.out.println(c);
				return true;
			}
		}
		System.out.println("Channel not found");
		return false;
	}

	public boolean synChannel(Integer num) {

		for (Channel c : channels) {
			if (c.getNumber().equals(num)) {
				currentChannel = c;
				return true;
			}
		}

		throw new ExceptionChannel("Channel not sycronized");
	}

	/*
	 * Alterar canal: recebe como parâmetro “próximo” ou “anterior” e altera o canal
	 * atual de acordo com o parâmetro solicitado. Se o canal atual for o último da
	 * lista e for solicitado próximo canal, deve-se voltar ao início da lista. Já
	 * se for o primeiro canal e solicitar o anterior, deve-se pular para o último
	 * canal da lista.
	 * 
	 */

	public boolean changeChannel(String arg) {

		if (arg.equalsIgnoreCase("Next")) {
			int i = 0;
			for (Channel ch : channels) {

				if (ch.equals(currentChannel)) {
					try {

						// canal atual recebe o proximo canal em ordem do numero do canal.
						currentChannel = channels.get(i + 1);
					} catch (IndexOutOfBoundsException e) {
						// System.out.println(e.getMessage());
						currentChannel = channels.get(0);
					}
					return true;
				}
				i++;
			}
		} else if (arg.equalsIgnoreCase("Previous")) {

			int i = 0;
			for (Channel ch : channels) {

				if (ch.equals(currentChannel)) {
					try {
						// canal atual recebe o canal anterior em ordem do numero do canal.
						currentChannel = channels.get(i - 1);
					} catch (IndexOutOfBoundsException e) {
						currentChannel = channels.get(channels.size() - 1);
					}
					return true;
				}
				i++;
			}
		}
		return false;
	}
	
	public void Showgrid() {
	
		for(Channel ch : channels ) {
			System.out.println(ch);
		}
		
	}

	
	
	
	
	
	
	
	
	
	
}
