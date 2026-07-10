public class Manager {
    private String managerName;
    private int managerId;
    Manager(){

    }
    
Manager(String managerName, int managerId){
    this.managerId=managerId;
    this.managerName=managerName;
}
public void setManageId(int manageId) {
    this.managerId = managerId;
}public void setManagerName(String managerName) {
    this.managerName = managerName;
}public int getManagerId() {
    return managerId;
}public String getManagerName() {
    return managerName;
}
void showDetails(){
    System.out.println("Name of the Manager is : "+ this.managerName);
    System.out.println("Manager ID: "+this.managerId);
}
}
