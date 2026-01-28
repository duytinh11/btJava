package bt4;

public class FullTimeEmployee extends Employee{
    private double fixedSalary;

    public FullTimeEmployee(String name, String id, double fixedSalary){
        super(name, id);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public Double getSalary() {
        return fixedSalary;
    }
}
