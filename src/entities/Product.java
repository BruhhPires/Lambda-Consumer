package entities;

public class Product {
	
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static boolean staticProductPredicate(Product p) { // NO METODO STATICO PRECISAMOS INCLUIR O ARGUMENTO 
		return p.getPrice() >=100;
	}
	
	public boolean nonStaticProductPredicate() { // COMO NÃO É STATIC NÃO PRECISA DE ARGUMENTO E USA O PRODUTO DA CLASSE "price"
		return price >=100;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price) ;
	}


}
