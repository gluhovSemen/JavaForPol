/**
 * @author ���������


 * ������� ���������� � 2 ��������- Book, Shoe  �  ����������� Product. ���������� ����� ���������  Present,
 ����������� ��������� Product � ����������  ����� it_can_be_presented(), ������� ����� ���������� ������.
�������� 2 ����� ������ (�������� Toy, Picture), �����������  ��������� Present.
� ���������� ������� ������ �������� Product-(Book, Shoe,Toy, Picture) , ��������� �� ���������� ��������� ��������� ����������.
��������� � ����� �������� ������� Product, ��������  c ������� ���������  instanceof  �� �������, ������� ���������  ��������� Present.
��� ������� ���������� �������� ������� Product, ������������ ����� ��������� Present, 
��������� ����� ������ ���������� it_can_be_presented().�
 */


package shop;

import java.util.Random;

public class shop {
	static shoe cross; 
	static book note; 
	static toy bear; 
	static picture pic; 

public static void init()
{	cross=new shoe();
	note=new book();
	bear=new toy();
	pic=new picture();
	}

 public static void info(product item){
	 System.out.println("The name of shop is "  + item.NAME + " and our telephone "+ product.PHONE); 
	item.name(); 
	 System.out.println("Each item costs $" + item.cost(1)); 
	 System.out.println("---------------");
 }
	
	
 public static void main(String[] args) { 
	 if (args.length!=1) {
         System.out.printf(" ������-�������  �������� %d\n",
                             args.length); 
                  return;
	 }

         Integer l=0;
                
         try { l=Integer.parseInt(args[0]);  }
     		    catch(Exception e) {
                System.out.printf("��������   %s �� ����� \n",args[0]);
                return;
            }
         
	 init(); 
/*	 
	 info(bear); 
	   info(note);
	   info(pic);
	   info(cross);*/
	   
	Random rand = new Random();
		
	 product[] p = new product[l];
	 
		for (int i=0;i<l;i++){
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
			
			
			//if(p[i] instanceof present){
				//(p[i]).it_can_be_presented();
			//	info(p[i]);
			//	}

		}
		
			
} }
 
