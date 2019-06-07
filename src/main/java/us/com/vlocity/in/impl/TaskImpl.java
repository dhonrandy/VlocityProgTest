package us.com.vlocity.in.impl;

import java.util.Date;
import us.com.vlocity.in.ITask;
import us.com.vlocity.utility.DateUtility;

public class TaskImpl implements ITask {

  private String duration;
  private String startDate;
  private String finishDate;

  public TaskImpl() {}

  public TaskImpl(String duration) {
    this(duration, null, null);
  }

  public TaskImpl(String startDate, String finishDate) {
    this(null, startDate, finishDate);
  }

  public TaskImpl(String duration, String startDate, String finishDate) {
    this.duration = duration;
    this.startDate = startDate;
    this.finishDate = finishDate;
  }

  @Override
  public void setDuration(String duration) {
    this.duration = duration;
  }

  @Override
  public String getDuration() {
    return duration != null ? duration : DateUtility.difference(getStartDate(), getFinishDate());
  }

  @Override
  public void setStartDate(Date date) {
    this.startDate = DateUtility.format(date);
  }

  public void setStartDate(String date) {
    this.startDate = date;
  }

  @Override
  public String getStartDate() {
    return startDate;
  }

  @Override
  public void setFinishDate(String date) {
    this.finishDate = date;
  }

  @Override
  public String getFinishDate() {
    return finishDate;
  }

}
