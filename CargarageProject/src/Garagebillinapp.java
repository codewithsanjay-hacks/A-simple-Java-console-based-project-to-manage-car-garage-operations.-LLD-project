import java.util.Scanner;

public class Garagebillinapp {
    public static void main(String[] args) {
        Garageservice garageservice  = new Garageservice();

        Scanner sc = new Scanner(System.in);
        System.out.println("_____________WELCOME TO XAVIER CAR GARAGE_____________");
        while(true){

                System.out.println("1: ADD CUSTOMER:");
                System.out.println("2: DISPLAY SERVICES:");
                System.out.println("3: EXIT");

                System.out.println("ENTER YOUR CHOICE");




            int choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Enter Your Name");
                    String name = sc.next();
                    System.out.println("Enter Your Phone Number");
                    String phone = sc.next();
                    System.out.println("Enter Your Carnumber");
                    String carnumber = sc.next();
                    System.out.println("Enter Your Carmodelnumber");
                    String model = sc.next();
                    garageservice.addcustomer(name, phone, carnumber, model);
                    break;
                case 2:
                    System.out.println("Enter Your Carnumber");
                    String carnumberrr = sc.next();
                    garageservice.createinvoice(carnumberrr);
                    break;
                case 3:
                    System.out.println("Exit");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice:");

            }
        }
    }
}

