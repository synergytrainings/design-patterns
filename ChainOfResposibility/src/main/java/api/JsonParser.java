package api;


public class JsonParser extends AbstractParser{


	public JsonParser(){
		this(null);
	}

	public JsonParser(Parser successor){
		this.setSuccessor(successor);
	}

	@Override
	protected boolean canHandleFile(String fileName){
		return fileName.endsWith(".json");
	}

	@Override
	protected void handleParse(String fileName) {
		//Parse JSON file
	}

}
