import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Garageservice {
    HashMap<String, Customer> customersmap;
    List<Service> availableservice;

    public Garageservice() {
        this.customersmap = new HashMap<>();
        this.availableservice = new ArrayList<>();
        Load();
       }
    public void Load(){
        availableservice.add(new Service("CARWASH:", 500));
        availableservice.add(new Service("TYRE REPLACEMENT:", 1000));
        availableservice.add(new Service("AIR FILTER CHANGE", 5000));
        availableservice.add(new Service("WHEEL CHANGE", 700));
        availableservice.add(new Service("PUNCTURE", 100));




    }

    public void addcustomer(String name, String phone, String carnumber, String model) {
        Car car = new Car(carnumber, model);
        Customer customer = new Customer(name, phone, car);
        customersmap.put(carnumber, customer);
        System.out.println("Customer Added Succesfully");
    }

    public void createinvoice(String carnumber) {
        if (!customersmap.containsKey(carnumber)) {
            System.out.println("No User Found");
            return;

        }
        Scanner sc = new Scanner(System.in);
        Customer customer = customersmap.get(carnumber);
        Invoice invoice = new Invoice(customer);
        System.out.println("Available Service Our Garage:");
        for (int i = 0; i < availableservice.size(); i++) {
            System.out.println(i + 1 + "-)" + availableservice.get(i).getName() + availableservice.get(i).getPrice());
        }
        while (true) {
            System.out.println("Enter the choice for Selecting a item or 0 to finish");
            int choice = sc.nextInt();
            if (choice == 0) break;
            if (choice > 0 && choice <= availableservice.size())
            {
                invoice.addservice(availableservice.get(choice - 1));
                System.out.println("service done");
            } else{
                System.out.println("Invalid choice");

            }

        } invoice.printInvoice();
    }

}


