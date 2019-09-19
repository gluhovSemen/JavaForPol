package lab5;

public class lab1 {

  public String gogogo(String one, String two, String three) {
      
       String RESULT;
     
       
       Float first,second;
       String operand;
       
       //ловим ошибки
     	try {
       	first=Float.parseFloat(one); 
       	operand=two;
       	second  =Float.parseFloat(three);
       	}
		       	
       catch(Exception e) {
           RESULT="один из параметров или не число \n";
           return RESULT;
       }
     	if (first == 0 || second==0) {
           RESULT="Error: числа не могут быть равны 0 ";
           return RESULT;}
     	
                
	Float result = null;
//считаем
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
	
	 RESULT=first+" "+operand+" "+second +" = "+result;
	return RESULT;
   }
}