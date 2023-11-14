package src;

public class App {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Manager("MK1","nguyen minh hoi",1500000.0);
        System.out.println("luong bonus (bang 10% luong): " + employees[0].calculateBonus());
        for(int  i = 0 ; i < employees.length;i++){
            if(employees[i] instanceof Manager){
                Promotable promotable = (Manager) employees[0];
                promotable.promote(10);
            }
        }
        System.out.println("luong sau khi duoc tang: " + employees[0].getSalary());
    }
}
