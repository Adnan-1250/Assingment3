class Bike {
    private String modelName;
    private String company;
    private int stock;
    private double price;

    Bike() {

    }

    Bike(String modelName, String company, int stock, double price) {
        this.modelName = modelName;
        this.company = company;
        this.stock = stock;
        this.price = price;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    void setCompany(String company) {
        this.company = company;
    }

    void setStock(int stock) {
        this.stock = stock;
    }

    void setPrice(double price) {
        this.price = price;
    }

    String getModelName() {
        return this.modelName;
    }

    String getCompany() {
        return this.company;
    }

    int getStock() {
        return this.stock;

    }

    double getPrice() {
        return this.price;
    }

    void addStock(int quatity) {
        this.stock += quatity;
        System.out.println("Stock Add Successfully");
    }

    void sellBike(int quantity) {
        if(this.stock>quantity){
             this.stock -= quantity;
            System.out.println("======================");
           
        }
        else{
            System.out.println("Insufficient Stock");
        }
    }

   public void  showDetails() {
        System.out.println("Model Name is: " + this.modelName);
        System.out.println("Comapne: " + this.company);
        System.out.println("Stock of the Bikes is:  " + this.stock);
        System.out.println("Price of the Bike is: " + this.price);

    }

}