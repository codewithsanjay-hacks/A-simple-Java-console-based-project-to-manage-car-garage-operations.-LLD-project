import java.util.ArrayList;
import java.util.List;

  public class Invoice {
    private  Customer customer;
    private List<Service> serviceList ;
    private double toatalamount;

      public Invoice( Customer customer) {
          this.toatalamount = 0;
          this.serviceList = new ArrayList<>();
          this.customer = customer;
      }

      public void addservice(Service service){

          this.serviceList.add(service);
          this.toatalamount +=service.getPrice();
      }

      public void printInvoice(){
          System.out.println("_________________INVOICE_________________");
          System.out.println("Customer name:"+ customer.getName() + "||"+"Phone number:" + customer.getPhone() + "||"+"Customer car: "+customer.getCar().getModel()+"||"+"Customer car number: "+customer.getCar().getCarnumber());
          System.out.println();
          for(Service service : serviceList){
              System.out.println("#:"+service.getName()+"₹"+service.getPrice());
          }
          System.out.println("Total amount"+toatalamount);
          System.out.println();
          System.out.println("_________________Thank You_________________");

      }
  }
