package main.com.synisys.trainings.designPatterns;

public interface Report {
	void accept(ReportVisitor reportVisitor);
}
