package us.com.vlocity.constants;

public enum Months {

  JAN("JANUARY"), FEB("FEBURUARY"), MAR("MARCH"), APR("APRIL"), MAY("MAY"), JUN("JUNE");

  private final String month;

  Months(String month) {
    this.month = month;
  }

  public String value() {
    return "[ " + month + " ]";
  }


}
