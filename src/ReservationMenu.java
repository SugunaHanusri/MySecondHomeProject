import java.util.Scanner;

public class ReservationMenu {


   public void getReservation() {
        int choice;
        String order, cnt="n";
        TrainReservation TR = new TrainReservation();
        Scanner sc = new Scanner(System.in);
       Scanner sc1 = new Scanner(System.in);
        do {
            System.out.println("\n\n=========== Main Menu ==============\n");
            System.out.println("1.  Book Ticket");
            System.out.println("2.  Cancel Ticket");
            System.out.println("3.  Show Booked History");
            System.out.println("4.  Search Ticket");
            System.out.println("5.  Check Availability");
            System.out.println("0.  Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                TR.bookTicket();
                System.out.print("\n Do you want to goto main menu? [y/n]: ");
                cnt = sc1.nextLine();
            } else if (choice == 2) {
                order = "2";
            } else if (choice == 3) {
                order = "3";
            }
        } while ((choice != 0) && (cnt.equals("y")));
        System.out.println("Thank you and Goodbye!");
    }
}
