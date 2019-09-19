package lab5;

import java.util.Random;

import javax.swing.JTextArea;
class Number{
	static int qqq;
	
	synchronized void first(JTextArea  outpute){

		
		Random rand = new Random(); 
		qqq=rand.nextInt(100);
		outpute.append(Thread.currentThread().getName()+"  "+qqq+"\n");

		notify();
		//////
		try{
			wait();
		}
		catch(InterruptedException e){
			outpute.append("Interrap perehva4eno!\n");
		}
	}
	
	synchronized void second(JTextArea  outpute){

		
		outpute.append(Thread.currentThread().getName()+" "+qqq+"\n");
		
		notify();
		try{
			wait();
		}
		catch(InterruptedException e){
			outpute.append("Interrap perehva4eno!\n");
		}
	}	
}

class Thread1 extends Thread{
	Number n;
	int col;
	JTextArea  output;
	Thread1(Number n, int m,JTextArea  outpute){
		this.n=n;
		col=m;
		output=outpute;
		new Thread(this, "Производитель ").start();
	}
	public void run(){
		for(int i=0;i<col; i++){
			n.first(output);
		}
	}
}

class Thread2 extends Thread{
	Number n;
	int col;
	JTextArea  output;
	Thread2(Number n, int m,JTextArea  outpute){
		super("Потребитель ");
		this.n=n;
		col=m;
		output=outpute;
		start();
	}
	public void run(){
		for(int i=0;i<col; i++){
			n.second(output);
		}
	}
}

class lab3 {
	public static void laba3(JTextArea  outpute){
		try{
		
		Number n=new Number();
	    int col=100;
		new Thread1(n,col,outpute);
		new Thread2(n,col,outpute);
		}
		catch(Exception e){
outpute.append("You must type positive integer number only!/n");
		}
	}
}
