package Lesson19.Ex;

public class Manager {
    private final Task[] tasks;

    private final Epic[] epics;

    private final Subtask[] subtasks;

    public Manager(Task[] tasks, Epic[] epics, Subtask[] subtasks) {
        this.tasks = tasks;
        this.epics = epics;
        this.subtasks = subtasks;
    }

    public void add (Task task){
        for (int i = 0; i < tasks.length; i++) {
            if(tasks[i]==null){
                tasks[i]=task;
                return;
            }
        }
    }

    public void add (Subtask subtask){
        for (int i = 0; i < subtasks.length; i++) {
            if(subtasks[i]==null){
                subtasks[i]=subtask;
                return;
            }
        }
    }

    public void add (Epic epic){
        for (int i = 0; i < epics.length; i++) {
            if(epics[i]==null){
                epics[i]=epic;
                return;
            }
        }
    }

    public Task[] getTasks() {
        return tasks;
    }

    public Epic[] getEpics() {
        return epics;
    }

    public Subtask[] getSubtasks() {
        return subtasks;
    }
}
