import java.util.Scanner;

public class dsa1_task3 {
    public static void main(String[] args) {
        System.out.println("Where is Facebook Main Office?\n1.SanFrancisco\n2.California\n3.New York");
        int correct  = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur choice: ");
        int userChoice = sc.nextInt();
        if(userChoice == correct)
                System.out.println("Correct answer!!!!!");
        else 
                System.out.println("Wrong answer better luck next time!!!!");
        }
}
