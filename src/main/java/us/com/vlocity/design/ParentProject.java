package us.com.vlocity.design;

import java.util.ArrayList;
import java.util.List;
import us.com.vlocity.in.ITask;

public class ParentProject extends Project {

  private String projectName;
  private String month;
  private String tab;
  private List<Project> projects;
  private ITask task;

  public ParentProject(String projectName, ITask task) {
    this.projectName = projectName;
    this.task = task;
    this.projects = new ArrayList<>();
  }

  @Override
  public void addRootProject(Project root) {
    projects.add(root);
  }

  @Override
  public void removeRootProject(Project root) {
    projects.remove(root);
  }

  @Override
  public List<Project> getChildProjects() {
    return projects;
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
    System.out.println("{");
    StringBuilder sb = new StringBuilder();
    sb.append(tab+"Month: " + this.getMonth() + "\n");
    sb.append(tab+"Project Name: " + projectName + "\n");
    sb.append(tab+"Duration: " + task.getDuration() + "\n");
    sb.append(tab+"Start Date: " + task.getStartDate() + "\n");
    sb.append(tab+"Finish Date: " + task.getFinishDate() + "\n");
    System.out.println(sb.toString());
    System.out.println(tab+"[");
    projects.forEach(item -> item.printSchedule());
    System.out.println(tab+"]");
    System.out.println(tab+"}");
  }

}
