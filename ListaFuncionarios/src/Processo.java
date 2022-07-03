
public class Processo {

    private Integer id;
    private String name;
    private Double salary;

    public Processo() {
    }

    public Processo(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }

    public String toString() {
        return "Id: " +id + ", " + name + ", " + String.format("%.2f", salary);
    }
}