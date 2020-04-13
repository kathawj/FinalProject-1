
public class WishList extends Items{
	private int quantity; 
	private double price;
	
	public WishList(String name, double price, int quantity) {
		super(name, price, quantity);
		this.quantity= quantity;
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "WishList [items=" + quantity + ", price=" + price + "]";
	} 
	
	
	
	

}
