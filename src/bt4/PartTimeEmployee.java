package bt4;

public class PartTimeEmployee extends Employee{
    private double workingHours;
    private double hourlyRate;

    public PartTimeEmployee(String name, String id,double workingHours,double hourlyRate){
        super(name,id);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        return workingHours * hourlyRate;
    }
}
