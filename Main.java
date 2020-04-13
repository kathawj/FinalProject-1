

public class Main {
	public static void main(String [] args){
		
		Items a1, a2, a3; 
		a1 = new Tops("Blouse", 12.99, 1);
		a2 = new Bottoms("Shorts", 10.50, 1); 
		
		Storage s = new Storage(5); 
		
		s.addItem(a1);
		System.out.println("An item has been added successfully!"); 
		System.out.println(" " + a1);
		s.addItem(a2);
		System.out.println("An item has been added successfully!"); 
		System.out.println(" " + a2);
		
		System.out.println("Search for Blouse: " + s.searchItem("Blouse"));
		
		System.out.println("Remove Bottoms: " + s.removeItem(new Bottoms("Shorts",10.50 , 1)));
		System.out.println("Search for Blouse: " + s.searchItem("Shorts"));
		
		
		
		
		
    }
	
	
	
}
