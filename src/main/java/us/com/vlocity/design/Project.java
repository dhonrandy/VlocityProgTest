package us.com.vlocity.design;

import java.util.List;

public abstract class Project {

  public abstract String getProjectName();
  public abstract void printSchedule();
  public abstract void setMonth(String month);
  public abstract String getMonth();
  public abstract void setTab(String tab);
  
  public void addRootProject(Project root) {
    throw new UnsupportedOperationException("Current operation is not supported.");
  }
  
  public void removeRootProject(Project root) {
    throw new UnsupportedOperationException("Current operation is not supported.");
  }
  
  public List<Project> getChildProjects() {
    throw new UnsupportedOperationException("Current operation is not supported.");
  }
}
