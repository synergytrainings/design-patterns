import com.synisys.designpatterns.factory.dataaccess.api.Cache;
import com.synisys.designpatterns.factory.dataaccess.api.ObjectLoaderSaver;
import com.synisys.designpatterns.factory.dataaccess.impl.ObjectLoaderSaverFactory;
import com.synisys.designpatterns.factory.dataaccess.utils.DataType;


public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectLoaderSaver xmlLoaderSaver = ObjectLoaderSaverFactory.getObjectLoaderSaver(DataType.XML, Cache.noCache());
		xmlLoaderSaver.saveObject("1", new Integer(6));
		Integer integer = xmlLoaderSaver.loadObject("1", Integer.class);
		
		ObjectLoaderSaver sqlLoaderSaver = ObjectLoaderSaverFactory.getObjectLoaderSaver(DataType.MSSQL, Cache.defaultCache());
		sqlLoaderSaver.saveObject("2", "AAA");
		String str = sqlLoaderSaver.loadObject("2", String.class);
	}

}
