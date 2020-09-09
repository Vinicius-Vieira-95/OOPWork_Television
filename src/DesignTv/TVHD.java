package DesignTv;

import entititie.Television;

public class TVHD extends Television {

	private String LED;
	private String Plasma;
	private boolean HD;
	
	public TVHD(String LED, String plasma, boolean HD, String id) {
		super(id);
		this.LED = LED;
		this.Plasma = plasma;
		this.HD = HD;
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
		// TODO Auto-generated method stub
		
	}
	
	
	

}
