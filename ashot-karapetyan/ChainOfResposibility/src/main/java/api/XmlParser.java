package api;


public class XmlParser extends AbstractParser{

	public XmlParser(){
		this(null);
	}

	public XmlParser(Parser successor){
		this.setSuccessor(successor);
	}

	@Override
	protected boolean canHandleFile(String fileName){
		return fileName.endsWith(".xml");
	}

	@Override
	protected void handleParse(String fileName) {
		//Parse XML file
	}

}
