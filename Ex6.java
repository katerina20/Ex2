public class Ex6
{
  public static void main (String [] args) {

  int N=Integer.parseInt(args[0]);
  
  int hr=N/3600;
  int temp=hr*60;
  int min=N/60-temp;
  temp=temp*60+min*60;
  int sec=N-temp;

  System.out.println (hr+ " часов, "+ min+ " минут, "+ sec+ " секунд");

 }
}