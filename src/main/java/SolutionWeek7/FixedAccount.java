package SolutionWeek7;

public class FixedAccount  {
    int accountNo;
    String accountHolder;
    double savingsBalance;
    double interest;
    int duration;

    double Principal;
    double interestRate;



    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration ) {
        this.duration = duration;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getPrincipal() {
        return Principal;
    }

    public void setPrincipal(double principal) {
        Principal = principal;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }



}