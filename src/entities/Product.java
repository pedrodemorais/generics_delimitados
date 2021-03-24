package entities;

public class Product implements Comparable<Product>{
	private String name;
	private Double valor;
	
	public Product(String name, Double valor) {
		this.name = name;
		this.valor = valor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Nome: " + name + String.format(", %.2f%n", valor)+"";
	}

	@Override
	public int compareTo(Product  other) {
		// TODO Auto-generated method stub
		return valor.compareTo(other.getValor());
	}

	
	
	
	
	
	

}
