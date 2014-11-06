

import com.synisys.prototype.factory.PrototypeFactory;
import com.synisys.prototype.factory.PrototypeFactory.ModelType;

public class TestPrototypePattern 
{
	public static void main(String[] args) 
	{
		try 
		{
			String sectorPrototype  = PrototypeFactory.getInstance(ModelType.SECTOR).toString();
			System.out.println(sectorPrototype);
			
			String projectPrototype  = PrototypeFactory.getInstance(ModelType.PROJECT).toString();
			System.out.println(projectPrototype);
			
			String activityPrototype  = PrototypeFactory.getInstance(ModelType.ACTIVITY).toString();
			System.out.println(activityPrototype);
			
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
