import java.util.Scanner;
public class linear {
    


    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
      Print(0,num);
    }
    public static void Print(int i,int num){

        if(i > num)
        return;
        System.out.println(i);
        Print(i+1,num);
    }
}
