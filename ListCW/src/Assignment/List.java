package Assignment;




public class List<T> {

	private static final int INIT_LEN = 10;
	private T[] items; // the actual items 
	private int numItems; // the number of items currently in the list 
	private int currentObject;
	
	
	/*
	 * Constructor: initialize the list to be empty
	 */
	
	@SuppressWarnings("unchecked")
	public List() {
		items = (T[]) new Object[INIT_LEN];
		numItems = 0;
	}
	
	/*
	 * Add To End 
	 * For this I need to - given Object obj 
	 * 						DO: Add obj to the end of the list  
	 */
	
	public void addToEnd(T obj){
		
	
		if(items.length>10){
			System.out.println("you need to double the size of the array"); 

		} 
		
		if(numItems == 0){
			
			items[numItems]=obj;
			numItems++;
			
		}else{
					
			items[numItems]=obj;
			numItems++;
		}
		
	}
		
	/*
	 * toString
	 * In String form - form the object in the list in order, enclosed in square brackets, separated by space 
	 */
	
	@Override 
	public String toString(){
		String result = "";
		
		for(T o : items){
			 if(o == null){result = result + "[]";}else				 
		result = result + ("["+ o + "] ");
			
		}
	
		return result;
				
	}
	
	// lets have a go at the currentObject 
	

	

	
	
	// lets create the main method 
	
	public static void main(String [] args){
		
		List<String>l = new List<>();
	
		l.addToEnd("Fred");
		l.addToEnd("Betty");
		l.addToEnd("Judith");
		System.out.println(l);
				
	}
}
