public class BikeShowroom {
    private String showroomName;
    private String loctaion;
    private String ownerName;
    private Manager manager;
    BikeShowroom(){

    }
    BikeShowroom(String showroomName,String loctaion, String ownerName , Manager manager){
        this.showroomName=showroomName;
        this.loctaion=loctaion;
        this.manager=manager;
        this.ownerName=ownerName;
        this.manager = new Manager("Bilal", 1234);
    }
    public void setLoctaion(String loctaion) {
        this.loctaion = loctaion;
    }public void setManager(Manager manager) {
        this.manager = manager;
    }public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }public void setShowroomName(String showroomName) {
        this.showroomName = showroomName;
    }public String getLoctaion() {
        return loctaion;
    }public Manager getManager() {
        return manager;
    }public String getOwnerName() {
        return ownerName;
    }public String getShowroomName() {
        return showroomName;
    }
    void showDetails(){
        System.out.println("Show Room Name is : "+ this.showroomName);
        System.out.println("Location of the Show Raoom is: "+ this.loctaion);
        System.out.println("Manager of this Show Room is: "+ this.manager);
        System.out.println("Owner anme of this Show Room is: "+ this.ownerName);
    }
    void showAllBiks(Bike[] bikes){
        for(int i=0;i<bikes.length;i++){
            System.out.println("=================Bike "+i+1+"=================");
          bikes[i].showDetails();
         

        }
    }


    
}
