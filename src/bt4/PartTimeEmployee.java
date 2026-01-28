package bt4;

public class PartTimeEmployee extends Employee{
    private Double workingHours;
    private Double hourlyRate;

    public PartTimeEmployee(String name, String id,Double workingHours,Double hourlyRate){
        super(name,id);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public Double getSalary() {
        return workingHours * hourlyRate;
    }
}
