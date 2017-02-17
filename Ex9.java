public class Ex9
{
  public static void main (String [] args) {

  int a=Integer.parseInt(args[0]);
  if ((a>999)&&(a<10000))
  {
    int num1=a/1000;
    int num2=(a-num1*1000)/100;
    int num3=(a-num1*1000-num2*100)/10;
    int num4=a%10;

    if ((num1==num4)&&(num2==num3))
      System.out.println ("Данное число читается одинаково слева направо и справа налево");
    else  System.out.println ("Данное число НЕ читается одинаково слева направо и справа налево");
  }
  else
    System.out.println ("Число не входит  в диапозон");
 }
}