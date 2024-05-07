//import java.*;
import java.util.*;
class HelloProgramming {
       public void MainMenuItms() {
            System.out.println("\n\n=========== Main Menu ==============\n");
            System.out.println("1.  Book Ticket");
            System.out.println("2.  Cancel Ticket");
            System.out.println("3.  Show Booked History");
            System.out.println("4.  Search Ticket");
            System.out.println("5.  Check Availability");
            System.out.println("0.  Exit");
           System.out.println("Enter your choice: ");
        }

        public void AvailableTrains(){
            System.out.println("\n Searching for available Trains.....:");
           System.out.println("\n1. Train: ABC Express");
            System.out.println("Departure Time:08:00 AM");
            System.out.println("Arrival Time: 04:00 PM");
            System.out.println("Class: Sleeper");
            System.out.println("Availability: 50 seats");
            System.out.println("Cost per Ticket:$20");
            System.out.println("\n2. Train: XYZ Superfast");
            System.out.println("Departure Time:09:30 AM");
            System.out.println("Arrival Time: 05:30 PM");
            System.out.println("Class: AC Chair Car");
            System.out.println("Availability: 20 seats");
            System.out.println("Cost per Ticket:$");
         }
         public void BookTicket() {
             System.out.println("======= Book Ticket ========== ");
             System.out.println("1. Enter Source and Destination ");
             System.out.println("2. Go back to Main Menu ");
             System.out.println("Enter your BT choice: ");
         }
        public static void main(String args[]) {
            HelloProgramming MI = new HelloProgramming();
            int choice, choice1;
            String order;
            Scanner sc = new Scanner(System.in);
            do {
                MI.MainMenuItms();
                choice = sc.nextInt();
                if (choice == 1) {
                    Scanner src = new Scanner(System.in);
                    Scanner BT = new Scanner(System.in);
                    Scanner PST = new Scanner(System.in);
                    Scanner CB = new Scanner(System.in);
                    MI.BookTicket();
                    choice1 = src.nextInt();
                    if (choice1 == 1) {
                        System.out.println("==== Enter Source and Destination ===");
                        System.out.println("Source station:");
                        String srcst = BT.nextLine();
                        System.out.println("Target station:");
                        String tgtst = BT.nextLine();
                        System.out.println("Date of Travel (DD/MM/YYYY):");
                        String dtot = BT.nextLine();
                        System.out.println("Number of Tickets:");
                        Integer not = BT.nextInt();
                        MI.AvailableTrains();
                        System.out.println("\nEnter the number of the train you want to book:");
                        Integer tno = src.nextInt();
                        System.out.println("\n ========== Enter Passenger Details==============");
                        Integer i;
                        for (i = 1; i <= not; i++) {
                            System.out.println("\n Passenger " + i + ":");
                            System.out.println("Name: ");
                            String name = PST.nextLine();
                            System.out.println("Age: ");
                            String age = PST.nextLine();
                            System.out.println("Gender [M/F]: ");
                            String gndr = PST.nextLine();
                        }

                        System.out.println("Confirm booking? [Y/N]:");
                        String conf = CB.nextLine();
                        System.out.println("Entered value: " + conf);
                        if (conf.equals("Y")) {
                            System.out.println("Booking Confirmed! Your Booking Reference number is: XYZ123345");
                        } else
                            System.out.println("Booking Cancelled!");
                    }
                } else if (choice == 2) {
                    order = "2";
                } else if (choice == 3) {
                    order = "3";
                }
            } while ((choice != 0));
            System.out.println("Thank you and Goodbye!");
        }
    }

