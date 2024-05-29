package Taskmanagement6;

import java.util.LinkedList;
import java.util.List;

public class TaskManagementSystem {
    private List<Task> tasks;

    public TaskManagementSystem() {
        tasks = new LinkedList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTaskById(int taskId) {
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                tasks.remove(task);
                break;
            }
        }
    }

    public Task findTaskById(int taskId) {
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                return task;
            }
        }
        return null;
    }

    public void displayTasksSortedByDueDate() {
        tasks.sort((t1, t2) -> t1.getDueDate().compareTo(t2.getDueDate()));
        System.out.println("Tasks sorted by due date:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        TaskManagementSystem taskSystem = new TaskManagementSystem();
        taskSystem.addTask(new Task(1, "Task 1", 2, "2022-12-15"));
        taskSystem.addTask(new Task(2, "Task 2", 1, "2022-12-10"));
        taskSystem.addTask(new Task(3, "Task 3", 3, "2022-12-20"));

        // Display all tasks
        System.out.println("All tasks:");
        for (Task task : taskSystem.tasks) {
            System.out.println(task);
        }
        System.out.println();

        // Remove a task by ID
        taskSystem.removeTaskById(2);

        // Display all tasks after removing one
        System.out.println("All tasks after removing one:");
        for (Task task : taskSystem.tasks) {
            System.out.println(task);
        }
        System.out.println();

        // Find and display a task by ID
        System.out.println("Find and display a task by ID:");
        Task foundTask = taskSystem.findTaskById(1);
        if (foundTask != null) {
            System.out.println(foundTask);
        } else {
            System.out.println("Task not found");
        }
        System.out.println();

        // Display all tasks sorted by due date
        taskSystem.displayTasksSortedByDueDate();
    }
}