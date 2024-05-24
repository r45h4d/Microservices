package ChainOfResponsibility;

public abstract class Employee {
    Employee nextApprover;

    public void setNextApprover(Employee nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void processRequest(Withdraw request);
}
