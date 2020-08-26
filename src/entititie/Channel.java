package entititie;

public class Channel {

	private String name;
	private Integer number;
	private boolean HD;

	public Channel() {
		
	}

	public Channel(String name, Integer number, boolean hd) {
		this.name = name;
		this.number = number;
		this.HD = hd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public boolean isHd() {
		return HD;
	}

	public void setHD(boolean hd) {
		this.HD = hd;
	}
	
	public String toString() {
		return "Tv:"+ name +" Canal: "+number ;
		
	}

}
