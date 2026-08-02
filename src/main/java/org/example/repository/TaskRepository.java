package org.example.repository;

import org.example.model.Task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskRepository {
    List<Task> tasklist= new ArrayList<>();
    // add task
    public void addTask(Task task){
        tasklist.add(task);
    }
    // Print all task
    public List<Task>findAll(){
        return  tasklist;
    }
    // find by id task
    public Task findByTaskNumber(int taskNumber) {
        for (Task task : tasklist) {
            if (task.getTaskNumber() == taskNumber) {
                return task;

            }
        }
        return  null;
    }

    public Boolean removeById(int id){
        Iterator <Task> taskListIterator =  tasklist.iterator();
        while (taskListIterator.hasNext()){
            Task task= taskListIterator.next();
            if(task.getTaskNumber()==id){
                taskListIterator.remove();
                return true;
            }

        }
        return false;


    }

}
