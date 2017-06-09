package volume1.chapter13.example5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTest {

    public static void main(String[] args) {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-63-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Frances Cruz"));
        System.out.println(staff);

        staff.remove("567-24-2546");
        staff.put("456-62-5527", new Employee("Frances Miller"));

        System.out.println(staff.get("157-63-7935"));

        for (Map.Entry<String, Employee> entry : staff.entrySet()) {
            String key = entry.getKey();
            Employee value = entry.getValue();
            System.out.println("Key = " + key + " , value = " + value);
        }

        Set<String> map = new HashSet<>();
        map.retainAll(map);

    }
}

class Employee {

    private String name;

    private double salary;

    public Employee(String n) {
        name = n;
        salary = 0;
    }

    @Override
    public String toString() {
        return "[ name = " + name + ", salary = " + salary + " ]";
    }

}
