public class ProjectApp {
    public static void main(String[] args) {


        Project x1 = new Project("Project 1", "Sys-Renew\nUpgrade payroll system and hardware","2022-5-22", "2022-6-21");
        Project x2 = new Project("Project 2", "LAB-IMPLEMENT\nUpdate Lab Results Reports", "2023-5-22", "2023-9-30");

        System.out.println(x1.toString());
        System.out.println("\n");
        System.out.println(x2.toString());
        System.out.println("\n");
        System.out.println("5 days late:");

        x1.pushProject(5);
        System.out.println("ID: ("+x1.getProjectId()+")");
        System.out.println(x1.getProjectDescription());
        System.out.println("Start: " + x1.getProjectedStartDate() + " " + "End: " + x1.getEstimatedEndDate() +"\n" );
        System.out.println("50 days late:");

        x1.pushProject(50);
        System.out.println("ID: ("+x1.getProjectId()+")");
        System.out.println(x1.getProjectDescription());
        System.out.println("Start: " + x1.getProjectedStartDate() + " " + "End: " + x1.getEstimatedEndDate()+"\n"  );
        System.out.println("5 days late:");

        x1.pushProject(5);
        System.out.println("ID: ("+x1.getProjectId()+")");
        System.out.println(x1.getProjectDescription());
        System.out.println("Start: " + x1.getProjectedStartDate() + " " + "End: " + x1.getEstimatedEndDate()+"\n"  );

        System.out.println("Deactivated:");
        x1.deactivateProject("2023-10-15");
        System.out.println("ID: ("+x1.getProjectId()+")");
        System.out.println(x1.getProjectDescription());
        System.out.println("Completed: " + x1.getActualEndDate()+"\n"  );


        System.out.println("Activated:");
        x1.activateProject();
        System.out.println("ID: ("+x1.getProjectId()+")");
        System.out.println(x1.getProjectDescription());
        System.out.println("Start: " + x1.getProjectedStartDate() + " " + "End: " + x1.getEstimatedEndDate());

    }
}
