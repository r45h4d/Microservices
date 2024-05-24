package ChainOfResponsibility;

public class ResponsiblePerson extends Employee{
    @Override
    public void processRequest(Withdraw request) {
        if(request.getAmount()<=10000){
            System.out.println("The amount (" + request.getAmount() + ") was approved by the Responsible Person");
        }
        else if (nextApprover!=null) {
            System.out.println("The transaction was not approved because the daily limit was exceeded. Forwarding to Manager...");
            nextApprover.processRequest(request);
        }
        else{
            System.out.println("No approver available to handle the request.");
        }
    }
}
