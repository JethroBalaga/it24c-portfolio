package Bankacc;


import Bankacc.BankAccount;

class BankAccountMain {
    public static void main(String[] args){
                
        BankAccount account = new BankAccount();
        
        account.setName("Jethro Jay U. Balaga");
        account.setAge(20);
        account.setAccountNumber(20221486);
        account.deposit(61000.0);
        account.deposit(7000.0);
        account.displaySummary();
        
    }
}