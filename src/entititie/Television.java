package entititie;

import java.util.ArrayList;
import java.util.List;

public  class Television {

	public String id;
	private Integer vol;
	private Channel currentChannel;

	static final Integer UP = 1;
	static final Integer DOWN = 1;

	private static final Integer volMax = 10;
	private static final Integer volMin = 0;

	List<Channel> channels = new ArrayList<>();
	List<Channel> registeredChannels = new ArrayList<>();

	public Television(List<Channel> channels) {
		this.vol = 5;
		this.channels = registeredChannels;
		availableChannels();
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

	public void setCurrentChannel(Channel currentChannel) {
		this.currentChannel = currentChannel;
	}

	public void availableChannels() {

		registeredChannels.add(new Channel("BBC", 13, true));
		registeredChannels.add(new Channel("Globo", 10, true));
		registeredChannels.add(new Channel("SBT", 12, false));
		registeredChannels.add(new Channel("Band", 20, false));
		registeredChannels.add(new Channel("Record", 8, true));

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
	
	public void registerChannels() {
		
	}
	
	public boolean existingChannel(Channel ch) {
		
		for( Channel c : channels) {
			if(c.getNumber().equals(ch.getNumber())){
				System.out.println(c);
				return true;
			}
		}
		System.out.println("Channel not found");
		return false;
	}
	
	//Sicronizar canal///
	public void synChannel( Integer num) {
		
		for(Channel c : channels) {
			if(c.getNumber().equals(num)) {
				
			}
		}
		
	}
	
}
