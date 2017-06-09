package volume1.chapter4.example2;

import java.util.HashSet;

public class Test {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId();
        System.out.println(employee.getNextId());
        Employee employee2 = new Employee();
        employee2.setId();
        System.out.println(employee2.getNextId());
        Employee employee3 = new Employee();
        employee3.setId();
        System.out.println(employee3.getNextId());

        HashSet<Object> set = new HashSet<>();
        String str1 = new String("123");
        String str2 = new String("123");
        set.add(str1);
        set.add(str2);
        System.out.println("size:" + set.size());
        StringBuffer stringBuffer1 = new StringBuffer("123");
        StringBuffer stringBuffer2 = new StringBuffer("123");
        set.add(stringBuffer1);
        set.add(stringBuffer2);
        System.out.println("size:" + set.size());
        System.out.println("str1=str2 :" + (str1 == str2) + "\nstringBuffer1=stringBuffer2:" + (stringBuffer1 == stringBuffer2));
        System.out.println(str1.hashCode() == str2.hashCode());
    }
}

class Employee {

    private int id;

    private static int nextId = 1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }
}
