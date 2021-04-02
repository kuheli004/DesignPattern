package Prototype;

import java.util.List;

public class PrototypePatternTest {
    public static void main(String args[]) throws CloneNotSupportedException {
        Employee emps=new Employee();
        emps.loadData();
        Employee empsNew= (Employee) emps.clone();
        Employee empsNew1= (Employee) emps.clone();
        List<String> s1=empsNew.getEmpList();
        s1.add("John");
        List<String> s2=empsNew1.getEmpList();
        s2.remove("Pankaj");
        System.out.println(emps.getEmpList());
        System.out.println(s1);
        System.out.println(s2);
    }
}
