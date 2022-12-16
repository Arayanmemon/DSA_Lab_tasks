package Lab2;
import java.util.Scanner;

class Lab2 {
    Scanner sc = new Scanner(System.in);
    int arr[];

    public void menu() {
        boolean loop = true;
        while (loop) {

            System.out.println("1- Input Array/Create Array");
            System.out.println("2- Display Array");
            System.out.println("3- Search");
            System.out.println("4- Update");
            System.out.println("5- Insertion");
            System.out.println("6- Deletion");
            System.out.println("7- Exit");
            System.out.print("Enter your choice : ");

            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    input();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    if(search() == -1){
                        System.out.println("Element not found!");
                    }
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    insert();
                    break;
                case 6:
                    delete();
                    break;
                case 7:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public void input() {
        System.out.println("Enter array size");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
            
    }

    public void display() {  // method to display an array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index "+i+ " is "+arr[i]);
        }
    }

    public int search() {
        System.out.print("Enter element that you want to search: ");
        int el = sc.nextInt();  // target the input element 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                System.out.println(el+" is found at index "+i);
                return i;
            }
        }
        return -1;
    }

    public void update() {
        System.out.println("Enter index of element that you want to update: ");
        int index = sc.nextInt();
        System.out.println("Enter new value: ");
        int val = sc.nextInt();
        arr[index] = val;
    }

    public void insert() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value of "+i+" index: ");
            arr[i] = sc.nextInt();
        }
    }

    public void delete() {
        System.out.println("Enter index of element that you want to delete: ");
        int index = sc.nextInt();
        for(int i = index; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
    }
}