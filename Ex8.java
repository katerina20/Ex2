public class Ex8
{
  public static void main (String [] args) {

  int a=Integer.parseInt(args[0]);
  if ((a>99)&&(a<1000))
  {
    int num1=a/100;
    int num2=(a-num1*100)/10;
    int num3=a%10;

    if ((num1<num2)&&(num2<num3))
     {
      if (((num3-num2)==1)&&((num2-num1)==1))
         System.out.println ("Цифры данного числа образуют возрастающую арифметическую последовательность");
     else  System.out.println ("Цифры данного числа образуют возрастающую последовательность");
     }
    else  System.out.println ("Цифры данного числа НЕ образуют возрастающую последовательность");
  }
   else
    System.out.println ("Число не входит  в диапозон");
 }
}