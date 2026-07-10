public class SportsBike extends Bike{
    private int topSpeed;
    SportsBike(){

    }
    SportsBike(String modelName, String company, int stock, double price, int topSpeed){
        super(modelName, company, stock, price);
        this.topSpeed=topSpeed;
    }
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Top Speed of the Sport Bike is:"+ this.topSpeed);
    }
}
