package org.example.service;

import org.example.model.Task;
import org.example.repository.TaskRepository;
import java.util.List;

public class TaskService {
    // repostory class object call
   private TaskRepository repository = new TaskRepository();
// add task method
    public void addTask(Task task){
        if(task==null){
            throw new IllegalArgumentException("Task cannot be Null");
        }
        repository.addTask(task);
    }
    // Get all task
    public List<Task> getAllTasks(){
        return repository.findAll();

    }
    //  find task by ID
    public Task findByTaskNumber(int taskNumber){
        if(taskNumber<=0){
            throw new IllegalArgumentException("Task number must be greater than 0");
        }
        return  repository.findByTaskNumber(taskNumber);
    }
    public void removeTaskById(int id){
        boolean  removed=repository.removeById(id);
        if(removed){
            System.out.println("Task Removed Successfully!!!!");
        }
        else {
            System.out.println("Task Not Found");
        }
    }

    }


