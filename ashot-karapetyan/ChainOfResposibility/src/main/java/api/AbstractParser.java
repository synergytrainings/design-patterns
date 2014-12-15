package api;

public abstract class AbstractParser implements Parser{

	private Parser successor;

	@Override
	public void parse(String fileName){
		if(canHandleFile(fileName)){
			handleParse(fileName);
		}else if ( getSuccessor() != null ){
			getSuccessor().parse(fileName);
		}

	}

	protected abstract  boolean canHandleFile(String fileName);
	protected abstract  void handleParse(String fileName);


	Parser getSuccessor() {
		return successor;
	}

	public void setSuccessor(Parser successor) {
		this.successor = successor;
	}
}
