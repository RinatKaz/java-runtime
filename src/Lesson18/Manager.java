package Lesson18;

public class Manager {

    Task[] tasks;

    void addTask(Task task) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null) {
                tasks[i] = task;
                break;


            }
        }
    }

    void deleteTask(String id) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].id == id) {
                tasks[i] = null;
                return;
            }
        }
    }
}