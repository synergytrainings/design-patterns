import com.synisys.factory.CurrencyFactory;
import com.synisys.factory.CurrencyFactory.CountryName;

public class PatternTest {
	public static void main(String args[]) {
        System.out.println(CurrencyFactory.createCurrency(CountryName.Armenia).getCurrencyName());
        System.out.println(CurrencyFactory.createCurrency(CountryName.USA).getCurrencyName());
 }
}

