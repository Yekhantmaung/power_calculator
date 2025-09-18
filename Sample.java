import java.util.Scanner;
public class Sample {
    public static void main(String[]args){
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter base number : ");
        int base = sca.nextInt();
        System.out.print("Enter power number : ");
        int power = sca.nextInt();
        int result = 1;
        for(int a = 1;a <= power;a++){
            result*=base;
        }
        System.out.println("Result is : "+result);
    }
}