package DesignTv;


import java.util.List;

import entititie.Channel;
import entititie.Television;

public class SmartTV extends Television {

	
	private Integer inch; 
	
	public SmartTV() {
	}
	
	public SmartTV(Integer inch,List<Channel>ch, String id) {
		super(ch,id);
		this.setInch(inch);
		registerChannels();
	}

	public Integer getInch() {
		return inch;
	}

	public void setInch(Integer inch) {
		this.inch = inch;
	}

	@Override
	public void registerChannels() {
		currentChannel = channels.get(0);
	}

	@Override
	public String toString() {
		return "SmartTV: "+ currentChannel;
	}
	
	

}
