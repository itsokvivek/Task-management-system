package org.example.TaskManagerApp;

import org.example.Config.DbConnection;
import org.example.model.Task;
import org.example.service.TaskService;

import java.util.List;
import java.util.Scanner;

public class TaskManagerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // serive class object
        TaskService taskService=new TaskService();
        int choice ;
        do {
            System.out.println("1. Add Task");
            System.out.println("2. Find All Tasks");
            System.out.println("3. findByTaskNumber");
            System.out.println("4. RemoveById");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice=scanner.nextInt();


            switch (choice){
                case 1:
//                    hardcode value hai ise dynamic karna hai Task task = new Task(1,"Testing","testing","self"
//                    ,"development","high","vivek","rahul");
                    System.out.println("Enter TaskNumber: ");
                    int taskNumber= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter task Name:");
                    String taskName=scanner.nextLine();
                    System.out.println("Enter TaskDescription: ");
                    String taskDescription=scanner.nextLine();
                    System.out.println("Enter ProjectName");
                    String projectName=scanner.nextLine();
                    System.out.println("Enter your Department");
                    String department=scanner.nextLine();
                    System.out.println("Priority of Task");
                    String priority= scanner.nextLine();
                    System.out.println("Approved By Name");
                    String approvedByName=scanner.nextLine();
                    System.out.println("Assigne Name");
                    String assigneName=scanner.nextLine();
                    // task class object
                    Task task=new Task(
                            taskNumber,
                            taskName,
                            taskDescription,
                            projectName,
                            department,
                            priority,
                            approvedByName,
                            assigneName

                    );
                    taskService.addTask(task);
                    System.out.println("\n✅ Task added successfully!\n");
                    break;

                case 2:
                    List<Task> tasks = taskService.getAllTasks();

                    if(tasks.isEmpty()){
                        System.out.println("No tasks found.");
                    } else {
                        System.out.println("\n===== TASK LIST =====");

                        for(Task currentTask : tasks){
                            System.out.println(currentTask);
                            System.out.println("--------------------------------");
                        }
                    }
                    break;
                case 3:
                    System.out.println("enter the tasknumber");
                    int Tasknumber=scanner.nextInt();
                    Task foundTasks = taskService.findByTaskNumber(Tasknumber);
                    if(foundTasks== null){
                        System.out.println("NO task Found ");
                    }
                    else {
                        System.out.println(foundTasks);
                    }

                    break;
                case 4:
                    System.out.println("Enter Id");
                    int id=scanner.nextInt();
                    taskService.removeTaskById(id);
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        while(choice!=5);
        scanner.close();

    }

}
