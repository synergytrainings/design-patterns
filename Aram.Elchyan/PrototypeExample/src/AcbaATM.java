/**
 * Created by Aram on 11/6/2014.
 */
public class AcbaATM extends ATM {
    public AcbaATM() {
        this.maximumAvailableWithdrawal = (double)900;
        this.additionalPercent = 0.02;
        this.moneyInMachine = (double)3000;
    }
}
