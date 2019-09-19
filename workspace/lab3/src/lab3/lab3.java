/**
 *
 * 
*/

/**
 *
 * @author Glukhov Semen 23534/7
 * 
 * 3. Íàïèøèòå ïðèëîæåíèå ñ 2 ïîòîêàìè- ïðîèçâîäèòåëåì è ïîòðåáèòåëåì, êîòîðûå èìåþò ðàçäåëÿåìóþ ñòàòè÷åñêóþ ïåðåìåííóþ- ñêëàä.
 Òî åñòü ñêëàä íå ÿâëÿåòñÿ ìàññèâîì!
Ñêëàä õðàíèò öåëûå ÷èñëà îò 0 äî 100.
Ïðîèçâîäèòåëü ãåíåðèðóåò ÷èñëî îò 0 äî 100 è îòïðàâëÿåò åãî íà ñêëàä, âûâîäÿ èìÿ ïðîèçâîäèòåëÿ è ñãåíåðåííîå ÷èñëî.
Ïîòðåáèòåëü ÷èòàåò çíà÷åíèå ÷èñëà ñî ñêëàäà, êàê òîëüêî îíî òàì ïîÿâèëîñü, è âûâîäèò  íà êîíñîëü èìÿ ïîòðåáèòåëÿ è 
ïîëó÷åííîå ÷èñëî.
  Âûïîëíèòü çàäàíèå   ñ èñïîëüçîâàíèåì êîíñòðóêöèè synchronized . 
Íå èñïîëüçîâàòü â ýòîì çàäàíèè ôëàãè äëÿ ñèíõðîíèçàöèè ïîòîêîâ, à òîëüêî ìåòîäû wait è notify. 
Òàêæå íå èñïîëüçîâàòü ëþáûå çàäåðæêè äëÿ ïîòîêîâ ïîñëå íà÷àëà èõ ðàáîòû â âèäå ìåòîäîâ sleep, yield èëè wait c ïàðàìåòðîì.

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
		
		new Thread(this, "Ïðîèçâîäèòåëü ").start();
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
		super("Ïîòðåáèòåëü ");
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

