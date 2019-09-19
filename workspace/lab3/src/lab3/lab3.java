/**
 *
 * @author ���������
*/

/**
 *
 * @author ���������
 * 
 * 3. �������� ���������� � 2 ��������- �������������� � ������������, ������� ����� ����������� ����������� ����������- �����.
 �� ���� ����� �� �������� ��������!
����� ������ ����� ����� �� 0 �� 100.
������������� ���������� ����� �� 0 �� 100 � ���������� ��� �� �����, ������ ��� ������������� � ����������� �����.
����������� ������ �������� ����� �� ������, ��� ������ ��� ��� ���������, � �������  �� ������� ��� ����������� � 
���������� �����.
  ��������� �������   � �������������� ����������� synchronized . 
�� ������������ � ���� ������� ����� ��� ������������� �������, � ������ ������ wait � notify. 
����� �� ������������ ����� �������� ��� ������� ����� ������ �� ������ � ���� ������� sleep, yield ��� wait c ����������.

 */

package lab3;

import java.util.Random;


class Number{
	static int qqq;
	
	synchronized void first(){

		
		Random rand = new Random(); 
		qqq=rand.nextInt(100);
		System.out.print(Thread.currentThread().getName()+"  "+qqq+"\n");

		notify();
		//////
		try{
			wait();
		}
		catch(InterruptedException e){
			System.out.print("Interrap perehva4eno!\n");
		}
	}
	
	synchronized void second(){

		
		System.out.print(Thread.currentThread().getName()+" "+qqq+"\n");
		
		notify();
		try{
			wait();
		}
		catch(InterruptedException e){
			System.out.print("Interrap perehva4eno!\n");
		}
	}	
}

class Thread1 extends Thread{
	Number n;
	int col;
	
	Thread1(Number n, int m){
		this.n=n;
		col=m;
		
		new Thread(this, "������������� ").start();
	}
	public void run(){
		for(int i=0;i<col; i++){
			n.first();
		}
	}
}

class Thread2 extends Thread{
	Number n;
	int col;
	
	Thread2(Number n, int m){
		super("����������� ");
		this.n=n;
		col=m;
		
		start();
	}
	public void run(){
		for(int i=0;i<col; i++){
			n.second();
		}
	}
}

class lab3 {
	public static void main(String args[]){
		try{
		
		Number n=new Number();
	    int col=100;
		new Thread1(n,col);
		new Thread2(n,col);
		}
		catch(Exception e){
			System.out.print("You must type positive integer number only!/n");
		}
	}
}

