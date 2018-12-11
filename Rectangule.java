import java.util.Scanner;
public class Rectangule {
    public static void main(String [] ar){
    double area,L,W;
    Scanner ob=new Scanner(System.in);
        System.out.println("Enter the value of L : ");
    L=ob.nextDouble();
    System.out.println("Enter the value of W : ");
    W=ob.nextDouble();
    area=L*W;
        System.out.println("Rectangle area is : "+area);
    }
}