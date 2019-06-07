package us.com.vlocity.executor;

import us.com.vlocity.constants.Months;
import us.com.vlocity.design.ChildProject;
import us.com.vlocity.design.ParentProject;
import us.com.vlocity.design.Project;
import us.com.vlocity.in.impl.TaskImpl;

public class MainEngine {

  public static void main(String[] args) {

    Project project =
        new ParentProject("Order Plants and Tress", new TaskImpl("03/21/2018", "03/25/2018"));
    project.setMonth(Months.MAR.value());
    project.setTab("");

    Project subProject1 =
        new ParentProject("Build Compost Bin", new TaskImpl("04/04/2018", "04/15/2018"));
    subProject1.setMonth(Months.APR.value());
    subProject1.setTab("\t");

    Project childProject1 =
        new ChildProject("Build Flower Beds and Edges", new TaskImpl("04/11/2018", "04/22/2018"));
    childProject1.setMonth(Months.APR.value());
    childProject1.setTab("\t\t");

    Project childProject2 =
        new ChildProject("Weed and Trim existing Yard", new TaskImpl("04/04/2018", "04/29/2018"));
    childProject2.setMonth(Months.APR.value());
    childProject2.setTab("\t\t");

    Project childProject3 =
        new ChildProject("Plant New Plants and Trees", new TaskImpl("04/04/2018", "04/22/2018"));
    childProject3.setMonth(Months.APR.value());
    childProject3.setTab("\t\t");

    Project childProject4 =
        new ChildProject("Re-Seed Bare Lawn Areas", new TaskImpl("04/18/2018", "04/22/2018"));
    childProject4.setMonth(Months.APR.value());
    childProject4.setTab("\t\t");

    subProject1.addRootProject(childProject1);
    subProject1.addRootProject(childProject2);
    subProject1.addRootProject(childProject3);
    subProject1.addRootProject(childProject4);
    project.addRootProject(subProject1);
    project.printSchedule();

  }
}
