public class Ex1
{
  public static void main (String [] args) {

  int a=Integer.parseInt(args[0]);
  float t=(float)a/100;
  if ((t<0.1)||(t>1))
   System.out.println ("Число не входит в диапозон");
  else
  {
   int lft=a/10;
   int rght=a%10;
  System.out.println ("Левое число = "+lft +"; Правое число = "+rght);
  }
 }
}