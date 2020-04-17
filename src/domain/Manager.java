package domain;
/**
 * клас ""Manager"", який наслідує клас ""Employee""
 * @author admin
 */
public class Manager extends Employee {
    /**
     * конструктор для об'єкта класу ""Manager""
     * @param employees - співробутник
     * @param name - ім'я
     * @param jobTitle - професія
     * @param level - рівень
     * @param dept - відділ
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }
    /**
     * метод toString()
     * @return string
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * конструктор для об'єкта класу ""Manager""
     * @param employees - співробітники
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    /**
     * конструктор для об'єкта класу ""Manager""
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
    /**
     * метод getEmployees() повертає значення змінної ""String s""
     * @return param s - навички
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * метод setEmployees() привласнює значення параметра ""employees""
     * @param employees - співробітники
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    /**
     * метод getEmployeesList() повертає значення змінної ""employees""
     * @return employees - співробітники
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
