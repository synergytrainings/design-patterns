package main.com.synisys.trainings.designPatterns;

import main.com.synisys.trainings.designPatterns.impl.Report;

public interface Iterator {
		   public boolean hasNext();
		   public Report next();
}
