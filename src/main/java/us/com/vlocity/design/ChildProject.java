package us.com.vlocity.design;

import us.com.vlocity.in.ITask;

public class ChildProject extends Project {

  private String projectName;
  private String month;
  private String tab;
  private ITask task;

  public ChildProject(String projectName, ITask task) {
    this.projectName = projectName;
    this.task = task;
  }

  @Override
  public String getProjectName() {
    return projectName;
  }

  public ITask getTask() {
    return task;
  }
  
  @Override
  public void setMonth(String month) {
    this.month = month;
  }

  @Override
  public String getMonth() {
    return month;
  }
  
  @Override
  public void setTab(String tab) {
    this.tab = tab;
  }

  @Override
  public void printSchedule() {
    StringBuilder sb = new StringBuilder();
    sb.append(tab+"Month: " + this.getMonth() + "\n");
    sb.append(tab+"Project Name: " + projectName + "\n");
    sb.append(tab+"Duration: " + task.getDuration() + "\n");
    sb.append(tab+"Start Date: " + task.getStartDate() + "\n");
    sb.append(tab+"Finish Date: " + task.getFinishDate() + "\n");
    System.out.println(sb.toString());
  }

}
