import java.util.Scanner;
public class SericeAdding {
    public static void main(String [] args){
    double i,n;
    double avg;
    double sum=0;
    Scanner ob=new Scanner(System.in);                      
        System.out.println("Enter the value of n: ");
        n=ob.nextInt();
    for(i=1;i<n;i++){                                   //jod(i=0,i+=2)/bejod(i=1,i+=2)
        sum=sum+i;
    //sum=sum+1/(i*i);
    System.out.println(sum);  //2^2+4^2(i=2/0,i=i+2,sum=sum(i*i)),,,1+1/2+1/3+1/4(1=1,i++,sum=sum+(1/i))
    //System.out.println(i);
    }
    //avg=sum/n;        //Average
        //System.out.println("Average is : "+avg); 
    }
}
