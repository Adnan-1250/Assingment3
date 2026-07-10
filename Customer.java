public class Customer {
    private String name ;
    private int customerID;
    Customer(){

    }
    Customer(String name, int customerID){
        this.customerID=customerID;
        this.name=name;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }public void setName(String name) {
        this.name = name;
    }public int getCustomerID() {
        return customerID;
    }public String getName() {
        return name;
    }void showDetails(){
        System.out.println("Nmae of The Customer is: "+ this.name);
        System.out.println("Id of the Customer is: "+ this.customerID);
    }
    
}
