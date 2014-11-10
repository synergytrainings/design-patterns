/**
 * Created by Aram on 11/6/2014.
 */
public abstract class ATM {
    protected Double moneyInMachine;

    protected Double maximumAvailableWithdrawal;

    protected int pinCode;

    protected double additionalPercent;

    protected CreditCard cardInMachine;

    public void putCardIntoMachine(CreditCard cardInMachine) {
        this.cardInMachine = cardInMachine;
    }

    public void insertPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void removeCardFromMachine() {
        //giving card back
        this.cardInMachine = null;
        this.pinCode = -1;
    }

    public void WithdrawCash(double amount) {
        amount *= (1 + additionalPercent / 100);
        if(amount < maximumAvailableWithdrawal && amount < moneyInMachine) {
            //sent request to bank containing requested amount
            //if request succeeded give money
        }
    }

    public double CheckBalance() {
        double balance = 0;
        //sent request to bank with creditCardId and pin code
        return balance;
    }

    public ATM clone() {
        HsbcATM atm = new HsbcATM();
        atm.moneyInMachine = moneyInMachine;
        atm.maximumAvailableWithdrawal = maximumAvailableWithdrawal;
        atm.additionalPercent = additionalPercent;
        return atm;
    }
}
