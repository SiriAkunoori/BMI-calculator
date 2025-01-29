import java.util.Scanner;
public class Bmicalculator{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter  weight");
        int Weight=scanner.nextInt();
        System.out.println("Enter  height");
        int Height=scanner.nextInt();
        scanner.close();
        if (Weight<35 && Height <120){
            System.out.println(" underweight");
        }else if(Weight==50 && Height==150){
            System.out.println("normal weight");
        }else if(Weight>35 && Height>120){
            System.out.println(" over weight");
        }else if(Weight>60 && Height>180){
            System.out.println(" obessed weight");
        }else{
            System.out.println("enter Weight and Height");
        }
    }
}

        






