public class Main {

    public static void main(String[] args) {
        CreditCard card = new CreditCard(123618, 23);
        ATM acbaATM = ATMPrototypeFactory.getATM(ATMType.ACBA);
        acbaATM.putCardIntoMachine(card);
        acbaATM.insertPinCode(2131334);
        acbaATM.CheckBalance();
        acbaATM.removeCardFromMachine();
    }
}
