
package lab5;

import java.util.Random;
import java.io.*;
import java.util.*;

import javax.swing.JTextArea;
import javax.swing.JTextField;


 interface product  {
	String NAME = "ShopShopShop\n"; 
	static final String PHONE = "555555\n"; 
	public void name(JTextArea textArea);

}

interface present extends product  {

	public void it_can_be_presented(JTextArea textArea);
	
}

 class picture implements present{
	
		
	public void it_can_be_presented(JTextArea textArea){
		textArea.append("Product can be presented\n");
		 	};
	public void name(JTextArea textArea) { 
		textArea.append("A picture Sargent John Singer Claude Monet\n"); 
		 } 

}

class toy implements present{
	
		
	public void it_can_be_presented(JTextArea textArea){
		textArea.append("Product can be presented\n");
		 	};
	public void name(JTextArea textArea) { 
		textArea.append("A toy teddy-bear\n"); 
		
		 } 

}
class shoe implements product {

	public void name(JTextArea textArea) { 
		textArea.append("NIKE DRI-FIT COOL\n "); 
		 } 

}

 class book implements product{
		public void name(JTextArea textArea) { 
			textArea.append("A book Pride and Prejudice\n"); 
		 } 

	}

 
 
 
 public class shop {
	static shoe cross; 
	static book note; 
	static toy bear; 
	static picture pic;

	
	
public static void lab2( int res, JTextArea textArea) {
    cross=new shoe();
	note=new book();
	bear=new toy();
	pic=new picture();
  
Random rand = new Random();
	
product[] p = new product[res];


	for (int i=0;i<res;i++){
		int n=rand.nextInt(3+1);
		
		switch(n) 
		{ 
		case 0: p[i]= cross; 
		break; 
		case 1: p[i]=note;
		break; 
		case 2: p[i]=bear; 
		break; 
		case 3: p[i]=pic; 
		break; 
		} 
		
		
		if(p[i] instanceof present){
			p[i].name(textArea);
			((present)p[i]).it_can_be_presented(textArea);
			
		}
		}
	
}
 }

 
