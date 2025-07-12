import java.util.Scanner;

public class Fname {

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        
     FiveName(0,num);
    }
    public static int i,num;


    public static void FiveName(int i,int num){

        if(i == num)
        return;
        System.out.println("aditya");
        FiveName(i+1,num);
    }
    
}
 