import com.synisys.designpatterns.client.JuiceReceipes;
import com.synisys.designpatterns.flyweight.utils.Vitamin;


public class Demo {
	public static void main(String[] args) {
		JuiceReceipes.findJuiceWithTheMost(Vitamin.B2).drink();
	}
}
