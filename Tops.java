
public class Tops extends Items {
	private double price;
	private int quantity;
	
	public Tops(String name, double price, int quantity) {
		super(name, price, quantity);
		this.price = price;
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Tops [name=" + name + " price=" + price + ", quantity=" + quantity + "]";
	} 
	
	

}
