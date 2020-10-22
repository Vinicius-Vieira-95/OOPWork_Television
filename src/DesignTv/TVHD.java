
package DesignTv;

import java.util.List;

import entititie.Channel;
import entititie.Television;

public class TVHD extends Television {

	private String LED;
	private String Plasma;
	private boolean HD;
	
	public TVHD() {
	}
	
	public TVHD(String LED, String plasma, boolean HD,List<Channel>ch, String id) {
		super(ch,id);
		this.LED = LED;
		this.Plasma = plasma;
		this.HD = HD;
		registerChannels();
	}

	public String getLED() {
		return LED;
	}

	public void setLED(String lED) {
		LED = lED;
	}

	public String getPlasma() {
		return Plasma;
	}

	public void setPlasma(String plasma) {
		Plasma = plasma;
	}

	public boolean isHD() {
		return HD;
	}

	public void setHD(boolean hD) {
		HD = hD;
	}

	@Override
	public void registerChannels() {
		
		currentChannel = channels.get(channels.size() -1);
	}

	@Override
	public String toString() {
		return "TVHD: " + currentChannel;
	}
	
	
	

}
