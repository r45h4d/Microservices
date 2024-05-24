package ChainOfResponsibility;

public class Manager extends Employee{
    @Override
    public void processRequest(Withdraw request) {
        if(request.getAmount()<=15000){
            System.out.println("The amount (" + request.getAmount() + ") was approved by the Manager");
        }
        else if (nextApprover!=null) {
            System.out.println("The transaction was not approved because the daily limit was exceeded. Forwarding to Group Manager...");
            nextApprover.processRequest(request);
        }
        else{
            System.out.println("No approver available to handle the request.");
        }
    }
}
