public class Ex3
{
  public static void main (String [] args) {

  int a=Integer.parseInt(args[0]);
  float t=(float)a/100;
  if ((t<0.1)||(t>1))
   System.out.println ("Число не входит в диапозон");
  else
  {
   int num1=a/10;
   int num2=a%10;
   int temp=num1;
   num1=num2;
   num2=temp;
   int chislo=num1*10+num2;
  System.out.println ("Число - "+chislo);
  }
 }
}