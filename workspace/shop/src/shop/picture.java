/** @author  Елизавета 23504/3*/
package shop;

public class picture implements present{
	
	public int cost(int id) { 
		if (id == 1) 
		return(50); 
		else 
		return(100); 
		} 
	
	public void it_can_be_presented(){
		 System.out.println("Product can be presented\n");
		 	};
	public void name() { 
		System.out.println("A picture Sargent John Singer Claude Monet"); 
		 } 

}
