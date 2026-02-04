package bt7;

public abstract class Employee {
    private String id;
    private String name;
    private Double baseSalary;

    public Employee(){}

    public Employee(String id,String name, Double baseSalary){
        this.id = getId();
        this.name = getName();
        this.baseSalary = getBaseSalary();
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

}
