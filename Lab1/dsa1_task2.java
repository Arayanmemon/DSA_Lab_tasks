import java.util.Scanner;

public class dsa1_task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age >= 0){
                if(age <= 13){
                        System.out.println("Price for you : $5");

                }else if(age >= 65){
                        System.out.println("price for you : $7");

                }else {
                        System.out.println("Price for you : $10");
                }
        }else{
                System.out.println("Invalid age cannot be negative");
        }
}
}
