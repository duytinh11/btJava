package bt4;

public class Employee {
    private String name;
    private  String id;

    public Employee(){}

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public double getSalary(){
        return 0.0;
    }
    public String NV() {
        return "ID: " + id + " | Tên: " + name;
    }

}
