import java.util.Scanner;
public class  rev{
    


    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
      Print(0,num);
    }
    public static void Print(int i,int num){

        if(i > num)
        return;
        System.out.println(num);
        Print(i,num-1);
    }
}
