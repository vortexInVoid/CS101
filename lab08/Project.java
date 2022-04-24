/**
 * Project
 */
public class Project {

    private String projectId;
    private String projectName;
    private String projectDescription;
    private String projectType;
    private Date projectedStartDate;
    private Date estimatedEndDate;
    private Date actualEndDate;
    private boolean isActive;
    private static int projectCounter = 1000;

    public Project(String projectName,String projectDescription,String projectedStartDate,String estimatedEndDate)
    {
        setProjectName(projectName);
        setProjectDescription(projectDescription);
        setProjectedStartDate(projectedStartDate);
        setEstimatedEndDate(estimatedEndDate);

        setProjectType();
        setProjectId();

    }

    //Here we have setters
    public void setProjectType()
    {
        int x = estimatedDaysToCompletion();
        if (x<367)
        {
            this.projectType = "SHORT TERM";
        }
        else if (x>367 && x<=3*366)
        {
            this.projectType = "INTERMEDIATE";
        }
        else
        {
            this.projectType = "LONG TERM";
        }
    }

    public void setProjectId()
    {
        int idMaker = projectCounter++;
        String dummy = this.projectType;
        if (dummy.equals("SHORT TERM"))
        {
            this.projectId = "ST-"+ Integer.toString(idMaker);
        }
        else if (dummy.equals("INTERMEDIATE"))
        {
            this.projectId = "IM-"+ Integer.toString(idMaker);
        }
        else if (dummy.equals("LONG TERM"))
        {
            this.projectId = "LT-"+ Integer.toString(idMaker);
        }
    }

    public void setProjectedStartDate(String date)
    {
        Date assigner = new Date(date);
        Date constraint = new Date("2000-01-01");
        if(constraint.isBefore(assigner))
        {
            this.projectedStartDate = assigner;
        }
    }

    public void setEstimatedEndDate(String date)
    {
        Date dummy = new Date(this.projectedStartDate);
        Date comparator = new Date(date);
        if(!this.projectedStartDate.isBefore(comparator))
        {
            this.estimatedEndDate = comparator;
        }
        else{
            dummy.addDays(30);
            this.estimatedEndDate = dummy;
        }
    }

    public void setActualEndDate(String date)
    {
        if ( date != null){
        Date dateOf = new Date(date);
        if (this.projectedStartDate.isBefore(dateOf)){
            this.actualEndDate = dateOf;
        }
        }
    
    }

    public void setProjectName(String name)
    {
    this.projectName= name;
    }

    public void setProjectDescription(String name)
    {
    this.projectDescription = name;
    }

    //Here we have getters
    public String getProjectId()
    {
        return this.projectId;
    }
    public String getProjectName()
    {
        return this.projectName;
    }
    public String getProjectDescription()
    {
        return this.projectDescription;
    }
    public String getProjectType()
    {
        return this.projectType;
    }
    public String getProjectedStartDate()
    {
        return this.projectedStartDate.toString();
    }
    public String getEstimatedEndDate()
    {
        return this.estimatedEndDate.toString();
    }
    public String getActualEndDate()
    {
        return this.actualEndDate.toString();
    }
    public boolean getActivity()
    {
        return this.isActive;
    }

    //Here starts the functionalities of the object
    /**
     * checks whether the projects have the same name
     * @param x
     * @return
     */
    public boolean equals(Project x)
    {
        if (x.projectName.equalsIgnoreCase(this.projectName))
        {
            return true;
        }
        else return false;
    }
    /**
     * returns project information in a paragraph
     */
    public String toString()
    {
        return this.projectName+"\n"+this.projectId+"\n"+this.projectType+"\n"+this.projectDescription+"\n"+this.projectedStartDate+"\n"+this.estimatedEndDate+"\n"+this.actualEndDate;
    }
    /**
     * calculates days between estimated start and end so that estimated project completion time will be returned
     * @return
     */
    public int estimatedDaysToCompletion()
    {
        Date x = new Date(this.estimatedEndDate);
        Date y = new Date(this.projectedStartDate);
        return x.daysBetween(y);
    }
    /**
     * Pushes the project by passed days
     * @param pushingDays
     */
    public void pushProject(int pushingDays)
    {
        this.estimatedEndDate.addDays(pushingDays);
    }
    /**
     * Activats the project
     */
    public void activateProject()
    {
        this.actualEndDate = null;
        this.isActive = true;
    }
    /**
     * Deactivates project
     * @param date
     */
    public void deactivateProject(String date)
    {
        this.actualEndDate = new Date(date);
        this.isActive = false;
    }
    





}
