/**  @author Glukhov Semen 23534/7

 *4.  Âûïîëíèòü ïðèëîæåíèå êîìàíäíîé ñòðîêè ñ äâóìÿ ïàðàìåòðàìè , îäèí èç êîòîðûõ – êîëè÷åñòâî ïîòîêîâ, 
äðóãîé ïàðàìåòð – êîëè÷åñòâî âûâîäèìûõ ñòðîê.
Íóæíî òàê ñèíõðîíèçîâàòü ïîòîêè, ÷òîáû èìåíà ïîòîêîâ âûâîäèëèñü ïîî÷åðåäíî- â êàæäîé ñòðîêå.
Ïîä ñèíõðîíèçàöèåé ïîäðàçóìåâàåòñÿ èñïîëüçîâàíèå êîíñòðóêöèè synchronized è ìåòîäîâ wait, notify.
Èñïîëüçîâàòü îãðàíè÷åíèÿ èç çàäàíèÿ 3. 
Èìÿ ïåðâîãî ïîòîêà äîëæíî âñåãäà âûâîäèòñÿ â íîâîé ñòðîêå. * 
 * */
 
package lab4;
public class lab4 {

    private final static class ST extends Thread {

        private Object wait;
        
        private int count;
        private int number;
        private boolean last = false;
        private int k;

        public ST(Object wait, int count, int number, int k) {
            this.wait =  wait;
            this.count = count;
            this.number = number;
            this.k=k;
        }
   
        @Override
        public void run() {

            for (int i=0;i<count;++i) {

                if (wait!=null && !(number==0 && i==0))
                   
                	synchronized(wait) {
                        try {if (k!=1) {   
                            wait.wait();
                        }        	}catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }

                System.out.print(this.getName()+" ");
                if (last) {
                    System.out.println("\n");
                }

                synchronized(this) { 
                    this.notify();
                }

            }
        }

    }

    public static void main(String[] args) {
        int NumberOfThreeds = Integer.parseInt(args[0]);
        int NumberOfLines = Integer.parseInt(args[1]);
        
    
        

        ST [] threads = new ST[NumberOfThreeds];
        
       
        for (int i=0;i<NumberOfThreeds;i++) {
            threads[i]= new ST(i==0?null:threads[i-1],NumberOfLines,i,NumberOfThreeds);
        }
        threads[0].wait = threads[NumberOfThreeds-1];
        threads[NumberOfThreeds-1].last = true;

        for (int i=NumberOfThreeds;i>0;i--) {
            new Thread(threads[i-1]).start();
        }

    }

}
