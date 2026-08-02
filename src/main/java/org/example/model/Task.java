package org.example.model;

public class Task {
    private  int taskNumber ;
    private  String TaskName;
    private  String TaskDescription;
    private  String projectName;
    private  String department;
    private String Priority;
    private String approvaledByName;
    private String AssigneeName;

    public Task ( int taskNumber,String TaskName, String TaskDescription, String projectName,
          String department, String Priority, String ApprovedByName, String AssingeeName){
        this.taskNumber=taskNumber;
        this.TaskName=TaskName;
        this.TaskDescription=TaskDescription;
        this.projectName=projectName;
        this.department=department;
        this.Priority = Priority;
        this.approvaledByName=ApprovedByName;
        this.AssigneeName=AssingeeName;
    }
    public int getTaskNumber(){
        return taskNumber;
    }

    @Override
    public String toString() {
        return """
            Task Number   : %d
            Task Name     : %s
            Description   : %s
            Project Name  : %s
            Department    : %s
            Priority      : %s
            Approved By   : %s
            Assignee      : %s
            """.formatted(
                taskNumber,
                TaskName,
                TaskDescription,
                projectName,
                department,
                Priority,
                approvaledByName,
                AssigneeName
        );
    }

}


