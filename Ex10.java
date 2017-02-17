public class Ex10
{
  public static void main (String [] args) {

  int a=Integer.parseInt(args[0]);
  if ((a>99)&&(a<1000))
  {
    int num1=a/100;
    int num2=(a-num1*100)/10;
    int num3=a%10;
    
    int sum=num1+num2+num3;
    int prod=num1*num2*num3;
    
    System.out.println ("Сумма - "+sum +", произведение - "+prod);
  }
   else
    System.out.println ("Число не входит  в диапозон");
 }
}