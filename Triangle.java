import java.util.Scanner;
public class Triangle {
    public static void main(String [] args){
    double a,b,c,s,area;
    Scanner ob=new Scanner(System.in);
        System.out.println("Enter the value of a : " );
        a=ob.nextInt();
        System.out.println("Enter the value of b : ");
        b=ob.nextInt();
        System.out.println("Enter the value of c : ");
        c=ob.nextInt();
        
        if((a+b>c)&& (b+c>a)&&(c+a>b)){
    s=(a+b+c)/2;
    area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Triangle area is : "+area);
    }
        else{
            System.out.println("Triangle is not possiable.");
        }
    }
}
