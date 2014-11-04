import java.util.Arrays;
import java.util.List;

import com.synisys.designpatterns.prototype.impl.Address;
import com.synisys.designpatterns.prototype.impl.Person;
import com.synisys.designpatterns.prototype.impl.PhoneNumber;
import com.synisys.designpatterns.prototype.utils.Gender;


public class Demo {

	public static void main(String[] args) {
		
		Address address = new Address("Yerevan", "Amiryan", "2/41", 4);
		String[] emails = new String[]{"valodik@gmail.com", "cactus_77@yandex.ru"};
		List<PhoneNumber> phoneNumbers = 
				Arrays.asList(new PhoneNumber("+374", "09956464656", true), 
							  new PhoneNumber("+374", "01016198181", false));
		
		Person person = new Person("Valodik", 37, Gender.MALE, address, emails, phoneNumbers);
		
		//Demo using copy constructor
		Person copyPerson1 = new Person(person);
		
		//Demo using deep cloning
		Person copyPerson2 = person.copy();
	}

}
