package ChainOfResponsibility;

public class Director extends Employee{
    @Override
    public void processRequest(Withdraw request) {
        if(request.getAmount()<=50000){
            System.out.println("The amount (" + request.getAmount() + ") was approved by the Director");
        }
        else{
            System.out.println("No approver available to handle the request. The transaction was not approved because the daily limit was exceeded");
        }
    }
}
