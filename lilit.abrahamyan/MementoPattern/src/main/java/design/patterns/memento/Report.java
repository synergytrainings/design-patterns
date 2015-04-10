package design.patterns.memento;
/**
 * Memento pattern implementation, originator
 * @author lilit.abrahamyan
 *
 */
public class Report {

	private String state;
	private int id;
	
	public Report(String state, int id) {
		super();
		this.state = state;
		this.id = id;
	}
	
	public ReportMemento save() {
		return new ReportMemento(state, id);
	}

	public void restore(ReportMemento memento) {
		this.id = memento.id;
		this.state = memento.state;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Report other = (Report) obj;
		if (id != other.id)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}
	
	
	public class ReportMemento {

		private String state;
		private int id;
		
		public ReportMemento(String state, int id) {
			super();
			this.state = state;
			this.id = id;
		}
	}

	
}
