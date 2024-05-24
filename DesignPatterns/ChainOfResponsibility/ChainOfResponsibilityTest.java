package ChainOfResponsibility;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        Withdraw withdraw = new Withdraw(1,55000, "azn", 123456);
        Employee responsiblePerson = new ResponsiblePerson();
        Employee manager = new Manager();
        Employee groupManager = new GroupManager();
        Employee director = new Director();

        responsiblePerson.setNextApprover(manager);
        manager.setNextApprover(groupManager);
        groupManager.setNextApprover(director);

        responsiblePerson.processRequest(withdraw);
    }
}
