package lab5;

public class lab1 {

  public String gogogo(String one, String two, String three) {
      
       String RESULT;
     
       
       Float first,second;
       String operand;
       
       //����� ������
     	try {
       	first=Float.parseFloat(one); 
       	operand=two;
       	second  =Float.parseFloat(three);
       	}
		       	
       catch(Exception e) {
           RESULT="���� �� ���������� ��� �� ����� \n";
           return RESULT;
       }
     	if (first == 0 || second==0) {
           RESULT="Error: ����� �� ����� ���� ����� 0 ";
           return RESULT;}
     	
                
	Float result = null;
//�������
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