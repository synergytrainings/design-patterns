import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aram on 11/6/2014.
 */
public class ATMPrototypeFactory {
    private static Map<ATMType, ATM> prototypes = new HashMap<ATMType, ATM>();

    static {
        prototypes.put(ATMType.HSBC, new HsbcATM());
        prototypes.put(ATMType.ACBA, new AcbaATM());
        prototypes.put(ATMType.ASHIB, new AshibATM());
    }

    public static ATM getATM(ATMType type) {
        return  prototypes.get(type).clone();
    }
}
