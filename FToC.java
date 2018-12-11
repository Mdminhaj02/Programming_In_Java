import java.util.Scanner;
public class FToC {
  public static void main(String [] ar) {
      Scanner ob=new Scanner(System.in);
  double F,C;
      System.out.println("Enter the fahrenheit temperature : ");
  F=ob.nextDouble();
  C=((5*F)-160)/9;
      System.out.println("fahrenheit to celsius : "+C);
  } 
}