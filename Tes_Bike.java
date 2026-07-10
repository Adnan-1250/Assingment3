public class Tes_Bike {
    public static void main(String[] args) {
        System.out.println("-----------------------------------Constructor----------------------------");
        System.out.println("=======================customer===========================");
        Customer customer1=new Customer();
        Customer customer2=new Customer("Bilal", 123);
        customer1.showDetails();
        customer2.showDetails();
     System.out.println("=======================Manager===========================");
        Manager manager =new Manager();
        Manager manager1 =new Manager("Ali", 2345);
        manager.showDetails();manager1.showDetails();
         System.out.println("=======================Bike Show Room===========================");
           BikeShowroom bikeShowroom1=new BikeShowroom();
           BikeShowroom bikeShowroom2=new BikeShowroom("Ali Autos", "Lahore", "Muhammad Zain", manager1);
           bikeShowroom1.showDetails();
           bikeShowroom2.showDetails();
            System.out.println("===============================Bikes ===========================");
        Bike bike1=new Bike();  
        Bike bike2=new Bike("HONDA", "Honad", 45, 560000.0);
        bike1.showDetails();
        bike2.showDetails();  
      System.out.println("=======================Electric Bike ===========================");
        ElectricBike electricBike1=new ElectricBike();
        ElectricBike electricBike2=new ElectricBike(234, 3.7, "YAMMA", "YAmma",32,6700.0);
        electricBike1.showDetails();
        electricBike2.showDetails();
         System.out.println("=======================Sports bikes ===========================");
        SportsBike sportsBike1=new SportsBike();
        SportsBike sportsBike2=new SportsBike("lenvoo", "lamberginy", 56, 78975.0, 200);
        sportsBike1.showDetails();
        sportsBike2.showDetails();
        System.out.println("===========================================");
          bike2.addStock(8);
          System.out.println("--------------------------------");
        bike2.sellBike(70);
        System.out.println("=========================================");
        Bike[] bikeList = new Bike[8]; 
        bikeList[1]=new Bike("CD-70", "Road Prince", 56, 67800.0);
        bikeList[2]=new Bike("CBR 150R", "Zics", 56, 67800.0);
        bikeList[3]=new Bike("CD-120", "HONDA", 7, 4665.0);
        bikeList[4]=new Bike("df45", "RYAMMA", 22, 567.0);
        bikeList[5]=new Bike("CD-90", "Vlektra", 7, 47887.0);
        for(int i=0;i<bikeList.length;i++){
            bikeList[i].showDetails();
        }
      

    }
    
}
