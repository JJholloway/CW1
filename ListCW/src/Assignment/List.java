package Assignment;

import java.util.*;


public class List<T> {

	private static final int INIT_LEN = 10;
	private T[] items; // the actual items 
	private int numItems; // the number of items currently in the list 
	
	/*
	 * Constructor: initialize the to be empty
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
		if(items.length >10){
			System.out.println("you need to double the size of the array"); 
		} //else 
		items.add(new Object(obj));
		
		
		
	}
		
	/*
	 * toString
	 * In String form - form the object in the list in order, enclosed in square brackets, separated by space 
	 */
	
	@Override 
	public String toString(){
		
		String result = null;
		
		for(Object o : items){
			 
		result = result + ("["+ o + "] ");
			
		}
		
		//System.out.println(result);
		return result;
		
		
	}
	
	
	// lets create the main method 
	
	public static void main(String [] args){
		
		
		
	}
}
