package DesignTv;


import entititie.Television;

public class SmartTV extends Television {

	
	private Integer inch; 
	
	public SmartTV(Integer inch, String id) {
		super(id);
		this.setInch(inch);
	}

	public Integer getInch() {
		return inch;
	}

	public void setInch(Integer inch) {
		this.inch = inch;
	}

	@Override
	public void registerChannels() {
		
	}
	

}
