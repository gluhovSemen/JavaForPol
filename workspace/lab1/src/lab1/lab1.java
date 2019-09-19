package lab1;

/** Glukov Semen 23534/7
 * 1. Ñîçäàòü ïðèëîæåíèå, âûïîëíÿþùåå ïðîñòûå àðèôìåòè÷åñêèå äåéñòâèÿ íàä îïåðàíäàìè-ïàðàìåòðàìè êîìàíäíîé ñòðîêè. 
Ïðîâåðèòü íàëè÷èå è êîëè÷åñòâî ïàðàìåòðîâ, à òàêæå èõ ñîîòâåòñòâèå ïðåäúÿâëÿåìûì íèæå òðåáîâàíèÿì.
Îïåðàíäàìè ìîãóò áûòü êàê öåëûå ÷èñëà, òàê è ÷èñëà ñ ïëàâàþùåé òî÷êîé.
Ïàðàìåòðû çàäàþòñÿ â âèäå :
	Îïåðàíä1 Îïåðàöèÿ Îïåðàíä2, ãäå îïåðàöèÿ - + | - | x | / 
Ðåçóëüòàò äîëæåí áûòü âûäàí â âèäå:
               Îïåðàíä1= (çíà÷åíèå ïàðàìåòðà1)
               Îïåðàöèÿ= (çíà÷åíèå ïàðàìåòðà2)
               Îïåðàíä2= (çíà÷åíèå ïàðàìåòðà3)
               
	Ñóììà| Ðàçíîñòü| Ïðîèçâåäåíèå| ×àñòíîå  =   (ðåçóëüòàò).*/




public class lab1 {

  public static void main(String[] args) {
       if (args.length!=3) {
           System.out.printf(" îøèáêà-ââåäèòå 3 ïàðàìåòðà %d\n",
                               args.length); 
           return;
       }
       
       Float first,second;
       String operand;
       
       //ëîâèì îøèáêè
     	try {
       	first=Float.parseFloat(args[0]); 
       	operand=args[1];
       	second  =Float.parseFloat(args[2]);
       	}
		       	
       catch(Exception e) {
           System.out.printf("îäèí èç ïàðàìåòðîâ  %s èëè  %s íå ÷èñëî \n",args[0],args[2]);
           return;
       }
     	if (first == 0 || second==0) {
           System.out.printf("Error: ÷èñëà íå ìîãóò áûòü ðàâíû 0 ",args[0],args[2]);
           return;}
     	
       if (operand == "+" | operand == "-" | operand == "x" | operand == "/") {
           System.out.printf("Error: wrong operand ",args[1]);
           return;
       }
           
	Float result = null;
//ñ÷èòàåì
	switch(operand) 
	{ 
	case "-": result=first-second; 
	break; 
	case "+": result=first+second; 
	break; 
	case "x": result=first*second; 
	break; 
	case "/": result=first/second; 
	break; 
	} 
	   System.out.printf(first +operand +second+"="+ result )  ;
	
   }}

