package us.com.vlocity.in;

import java.util.Date;

public interface ITask {
  
  void setDuration(String duration);

  String getDuration();
  
  void setStartDate(Date date);
  
  String getStartDate();
  
  void setFinishDate(String date);
  
  String getFinishDate();
}
