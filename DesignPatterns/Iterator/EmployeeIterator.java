package Iterator;

public class EmployeeIterator implements Iterator{
    EmployeeAggregate aggregate;
    int currentIndex;
    public EmployeeIterator(EmployeeAggregate aggregate){
        this.aggregate = aggregate;
    }
    @Override
    public boolean HasItem() {
        return currentIndex < aggregate.count();
    }

    @Override
    public Employee NextItem() {
        return HasItem() ? aggregate.getItem(currentIndex++) : new Employee();
    }

    @Override
    public Employee CurrentItem() {
        return aggregate.getItem(currentIndex);
    }
}
