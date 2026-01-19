import java.util.Scanner;
public class donutest {
    public static void main(String[] args){
        Scanner n  = new Scanner(System.in);

        while (true){
            System.out.println("1. Order Donut");
            System.out.println("2. Exit");
            System.out.print("Choose option: ");

            int choice = n.nextInt();

            if (choice == 1){
                donut order = new donut();
                order.inputOrder(n);
                order.total();
                order.displayOrder();
            }
            else if (choice == 2){
                System.out.println("Thank you po!");
                break;
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}





