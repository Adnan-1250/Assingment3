class ElectricBike extends Bike{
    private int batteryCapacity;
    private double ChargingTime;
    ElectricBike(){}
    ElectricBike(int batteryCapacity,double ChargingTime , String modelName, String company, int stock, double price){
        super(modelName, company, stock, price);
        this.batteryCapacity=batteryCapacity;
        this.ChargingTime=ChargingTime;
    }
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Battery Capicaty is: "+ this.batteryCapacity);
        System.out.println("Charging ime is : "+ this.ChargingTime);
    }


}