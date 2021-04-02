package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements  Cloneable{
    private List<String> empList;
    public Employee() {
        empList=new ArrayList<>();
    }
    public Employee(List<String> list)
        {
            this.empList=list;
        }

        public void loadData(){
            empList.add("Pankaj");
            empList.add("Raj");
            empList.add("David");
            empList.add("Lisa");
        }

        public List<String> getEmpList(){
        return empList;
        }

        public Object clone() throws CloneNotSupportedException{
            List<String> temp=new ArrayList<>();
            for(String s: this.empList){
                temp.add(s);
            }
            return new Employee(temp);
        }
}

