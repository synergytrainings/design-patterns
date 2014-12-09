
import api.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestParser {

	@Test
	public void test(){
		List<String> fileList = populateFiles();

		Parser xmlParser = new XmlParser();
		Parser jsonParser = new JsonParser(xmlParser);
		Parser textParser = new TextParser(jsonParser);

		for ( String fileName : fileList){
			textParser.parse(fileName);
		}

	}

	private static List<String> populateFiles(){

		List<String> fileList = new ArrayList<>();
		fileList.add("someFile.txt");
		fileList.add("otherFile.json");
		fileList.add("xmlFile.xml");
		fileList.add("csvFile.csv");
		fileList.add("csvFile.doc");

		return fileList;
	}

}
