package Logic;

public class Product {
	
	private String name;
	private String description;
	private String state;
	
	public Product(String name, String des, String state){
		this.name = name;
		this.description = des;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
