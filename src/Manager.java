package src;

public class Manager extends Employee implements Promotable{
    public Manager(String id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public double calculateBonus() {
        return this.salary * 0.1;
    }
    @Override
    public void promote(int salaryIncrease) {
        this.salary += salary*salaryIncrease / 100;
    }
}
