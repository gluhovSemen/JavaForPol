package lab1;

/** @author ��������� 23504/3
 * 1. ������� ����������, ����������� ������� �������������� �������� ��� ����������-����������� ��������� ������. 
��������� ������� � ���������� ����������, � ����� �� ������������ ������������� ���� �����������.
���������� ����� ���� ��� ����� �����, ��� � ����� � ��������� ������.
��������� �������� � ���� :
	�������1 �������� �������2, ��� �������� - + | - | x | / 
��������� ������ ���� ����� � ����:
               �������1= (�������� ���������1)
               ��������= (�������� ���������2)
               �������2= (�������� ���������3)
               
	�����| ��������| ������������| �������  =   (���������).*/




public class lab1 {

  public static void main(String[] args) {
       if (args.length!=3) {
           System.out.printf(" ������-������� 3 ��������� %d\n",
                               args.length); 
           return;
       }
       
       Float first,second;
       String operand;
       
       //����� ������
     	try {
       	first=Float.parseFloat(args[0]); 
       	operand=args[1];
       	second  =Float.parseFloat(args[2]);
       	}
		       	
       catch(Exception e) {
           System.out.printf("���� �� ����������  %s ���  %s �� ����� \n",args[0],args[2]);
           return;
       }
     	if (first == 0 || second==0) {
           System.out.printf("Error: ����� �� ����� ���� ����� 0 ",args[0],args[2]);
           return;}
     	
       if (operand == "+" | operand == "-" | operand == "x" | operand == "/") {
           System.out.printf("Error: wrong operand ",args[1]);
           return;
       }
           
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
	   System.out.printf(first +operand +second+"="+ result )  ;
	
   }}

