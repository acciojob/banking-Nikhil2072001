package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
this.name=name;
this.balance=balance;
this.minBalance=minBalance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception
int sumDummy = 0;
int temp = digits;
while(temp>0){
    sumDummy+=(temp%10);
 temp=temp/10;}
if(sumDummy==sum){
    String s= Integer.toString(sumDummy);
    return s;
}else{
    String s = "Account Number can not be generated";
     throw new Exception(s);
}
    }

    public void deposit(double amount) {
        //add amount to balance
this.balance=this.balance+amount;
    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
if(balance-amount>0 && balance-amount<minBalance){
    String s = "Insufficient Balance";
    throw new Exception(s);
}
balance-=amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }
}