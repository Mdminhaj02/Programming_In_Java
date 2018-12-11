import java.util.Scanner;
public class PrimeNumber {
    public static void main(String [] args){
    Scanner ob=new Scanner(System.in);
    int n,i,j;
    n=ob.nextInt();
    for (i=2;i<n;i++){
    
        for(j=2;j<i;j++){
        if(i%j==0){
        break;
        }
        if(i==j){
            System.out.println(" "+i +" ");
        }
        }
    }
    }
}