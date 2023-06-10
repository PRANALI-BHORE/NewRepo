package Collection;

public class Add {
	String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Add(String city) {
		super();
		this.city = city;
	}

	public Add() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Add [city=" + city + "]";
	}
	
	
}
