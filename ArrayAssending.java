import java.util.Scanner;
public class ArrayAssending {
    public static void main(String [] args){
    int[] arr=new int[10];
    int n,i,j,temp;
    Scanner ob=new Scanner(System.in);
        System.out.println("Enter the nmber how element want to be sorted. . .");
        n=ob.nextInt();
        System.out.printf("Enter %d Array Elements in Array: \n",n );
        for(i=0;i<n;i++){
            System.out.println("Enter Array Elements : "+i);
            arr[i]=ob.nextInt();
        }
        
        for(i=0;i<n;i++){
            System.out.println("i : "+i);
            for(j=i+1;n>j;j++){
                System.out.println("j: "+j);
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print("  "+arr[i]);
        }
        System.out.println(" ");
    }
}