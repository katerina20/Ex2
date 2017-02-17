public class Ex7
{
  public static void main (String [] args) {

  int K=Integer.parseInt(args[0]);
  if ((K<1) || (K>365))
   System.out.println ("Не входит в диапозон");
  else {
  int iden=K%7;
  int day=0;
   switch (iden) {
     case 0: day=2;
             break;
     case 1: day=3;
             break;
     case 2: day=4;
             break;
     case 3: day=5;
             break;
     case 4: day=6;
             break;
     case 5: day=7;
             break;
     case 6: day=1;
             break;
    }

  System.out.println (day);
  }
 }
}