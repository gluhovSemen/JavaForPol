/** @author  Елизавета 23504/3*/
package shop;

public class toy implements present{
	
	public int cost(int id) { 
		if (id == 1) 
		return(20); 
		else 
		return(30); 
		} 
	
	public void it_can_be_presented(){
		 System.out.println("Product can be presented\n");
		 	};
	public void name() { 
		System.out.println("A toy teddy-bear"); 
		
		 } 

}
