package Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        EmployeeAggregate aggregate = new EmployeeAggregate();
        aggregate.Add(new Employee(1,"Sənan", "Rəhimli"));
        aggregate.Add(new Employee(2,"İslam", "Cabbarlı"));
        aggregate.Add(new Employee(3,"Rüfət", "Qabilov"));
        aggregate.Add(new Employee(4,"Ruhan", "İsmayılov"));
        aggregate.Add(new Employee(5,"Tural", "Əhmədov"));

        Iterator iterator = aggregate.createIterator();
        while (iterator.HasItem()){
            System.out.println("ID = " + iterator.CurrentItem().id + ", Name = " + iterator.CurrentItem().name + ", Surname = " + iterator.CurrentItem().surname);
            iterator.NextItem();
        }
    }
}
