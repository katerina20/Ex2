public class Ex5
{
  public static void main (String [] args) {

  int a=Integer.parseInt(args[0]);
  float t=(float)a/100;
  if ((t<0.1)||(t>1))
   System.out.println ("����� �� ������ � ��������");
  else
  {
   a=(a%10)*10+(Math.round(a/10));

  System.out.println ("����� - "+a);
  }
 }
}