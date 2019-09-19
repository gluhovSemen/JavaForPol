package lab5;

import javax.swing.JTextArea;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;






public class lab4 {

    private final static class Task extends Thread {
       JTextArea textArea;

        private Object wait;
        //private Object notify;
        private int count;
        private int number;
        private boolean last = false;

        public Task(Object wait, int count, int number) {
            this.wait =  wait;
            this.count = count;
            this.number = number;
        }

        @Override
        public void run() {

            for (int i=0;i<count;++i) {

                if (wait!=null && !(number==0 && i==0))
                    synchronized(wait) {
                        try {
                            wait.wait();
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                lab55.textArea.append(" Thread"+this.number);
                
                if (last) {
                    lab55.textArea.append("\n");
                }

                synchronized(this) {
                    this.notify();
                }

            }
        }

    }

    public static void main(Integer one, Integer two,JTextArea textArea) {
    	try{
    		int NumberOfThreeds = one;
    	    int NumberOfLines = two; Task [] threads = new Task[NumberOfThreeds];

            for (int i=0;i<NumberOfThreeds;i++) {
                threads[i]= new Task(i==0?null:threads[i-1],NumberOfLines,i);
            }
            threads[0].wait = threads[NumberOfThreeds-1];
            threads[NumberOfThreeds-1].last = true;

            for (int i=NumberOfThreeds;i>0;i--) {
                new Thread(threads[i-1]).start();
            }

      
    	}
		catch(Exception e){
			lab55.textArea.append("You must type  numbers\n");
			
		}
       

}
}