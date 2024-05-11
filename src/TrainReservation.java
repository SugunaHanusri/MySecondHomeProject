import java.util.Scanner;

public class TrainReservation {

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
        System.out.println("Cost per Ticket $25");
    };

    public void  bookTicket()
    {
      int choice1;
        Scanner src = new Scanner(System.in);
        Scanner BT = new Scanner(System.in);
        Scanner PST = new Scanner(System.in);
        Scanner CB = new Scanner(System.in);
        TrainReservation TR= new TrainReservation();
        System.out.println("======= Book Ticket ========== ");
         System.out.println("==== Enter Source and Destination ===");
            System.out.print("Source station:");
            //  String srcst =
            BT.nextLine();
            System.out.print("Target station:");
            BT.nextLine();
            System.out.print("Date of Travel (DD/MM/YYYY):");
            BT.nextLine();

            TR.AvailableTrains();
            System.out.println("\nEnter the Train Number you want to book:");
            Integer tno = src.nextInt();

        System.out.print("Enter number of Tickets to book :");
       Integer not =  BT.nextInt();

            System.out.println("\n ========== Enter Passenger Details==============");
            Integer i;
            for (i = 1; i <= not; i++) {
                System.out.println("\n Passenger " + i + ":");
                System.out.print("Name: ");
                   PST.nextLine();
                System.out.print("Age: ");
                 PST.nextLine();
                System.out.print("Gender [M/F]: ");
               PST.nextLine();
            }

            System.out.print("Confirm booking? [y/n]:");
            String conf =  CB.nextLine();
              if (conf.equals("y")) {
                System.out.println("Booking Confirmed! Your Booking Reference number is: XYZ123345");
            } else
                System.out.println("Booking Cancelled!");

        //}
    }
}
