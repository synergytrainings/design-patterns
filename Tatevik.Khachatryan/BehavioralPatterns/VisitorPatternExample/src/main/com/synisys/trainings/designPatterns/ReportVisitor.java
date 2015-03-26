package main.com.synisys.trainings.designPatterns;
import main.com.synisys.trainings.designPatterns.impl.*;

public interface ReportVisitor {
	public void visit(Dasheboard dasheboard);
	public void visit(Chart chart);
	public void visit(Map map);
	public void visit(List list);		
}
