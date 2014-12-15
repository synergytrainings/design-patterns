package api;

public class TextParser extends AbstractParser{


	public TextParser(){
		this(null);
	}

	public TextParser(Parser successor){
		this.setSuccessor(successor);
	}

	@Override
	protected boolean canHandleFile(String fileName){
		return fileName.endsWith(".txt");
	}

	@Override
	protected void handleParse(String fileName) {
		//Parse text file
	}

}
