public class Ex4
{
  public static void main (String [] args) {

  int a=Integer.parseInt(args[0]);
  if ((a>99)&&(a<1000)){
   if (((float)a%2)!=0)
  System.out.println ("������ ����� �������� �������� �����������");
   else 
     System.out.println ("������ ����� �������� ��������");}
  else 
    System.out.println ("������ ����� �� �������� �����������");
 }
}