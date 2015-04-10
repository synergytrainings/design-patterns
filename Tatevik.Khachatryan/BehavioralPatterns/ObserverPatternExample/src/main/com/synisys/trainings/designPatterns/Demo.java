package main.com.synisys.trainings.designPatterns;

public class Demo {
	 public static void main(String[] args) {
		    Model model = new Model();
		    Observer observer = new Observer(model);
		    
		    //initialize projects		    
		    model.setProject(new Project("project title", "project description"));
		    		    		    
		    // we change the title of the project, observer will get notified
		    Project project = model.getProject();		    
		    model.setTitle("new title: " + project.getTitle());		      		    
		    
		    // we change the description of the project, observer will get notified		    
		    model.setDescription(project.getDescription() + " updated...");		 
		  }
}
