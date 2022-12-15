import java.util.Scanner;

public class dsa_task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of hours of work per week: ");
        int hours = sc.nextInt();
        System.out.print("Enter number of absent hours per week: ");
        int abshours = sc.nextInt();
        System.out.print("Hourly salary: ");
        int hourlySalary = sc.nextInt();
        int total = (hours - abshours)*52*hourlySalary;
        System.out.println("Your Yearly salary is : " + total);
        
}
}
