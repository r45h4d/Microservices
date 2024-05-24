package Iterator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAggregate implements Aggregate{
    List<Employee> employeeList = new ArrayList<>();
    public void Add(Employee employee){
        employeeList.add(employee);
    }
    public Employee getItem(int index){
        return employeeList.get(index);
    }
    public int count(){
        return employeeList.size();
    }
    @Override
    public Iterator createIterator() {
        return new EmployeeIterator(this);
    }
}
