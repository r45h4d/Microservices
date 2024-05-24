package ChainOfResponsibility;

public class GroupManager extends Employee{
    @Override
    public void processRequest(Withdraw request) {
        if(request.getAmount()<=30000){
            System.out.println("The amount (" + request.getAmount() + ") was approved by the Group Manager");
        }
        else if (nextApprover!=null) {
            System.out.println("The transaction was not approved because the daily limit was exceeded. Forwarding to Director...");
            nextApprover.processRequest(request);
        }
        else{
            System.out.println("No approver available to handle the request.");
        }
    }
}
