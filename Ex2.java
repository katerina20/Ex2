public class Ex2
{
  public static void main (String [] args) {

  int a=Integer.parseInt(args[0]);
  float t=(float)a/100;
  if ((t<0.1)||(t>1))
   System.out.println ("����� �� ������ � ��������");
  else
  {
   int num1=a/10;
   int num2=a%10;
   int sum=num1+num2;
   int prod=num1*num2;

  System.out.println ("����� - "+sum +"; ������������ - "+prod);
  }
 }
}