package Lesson19;

public class Epic extends Task {
    private final Subtask[] subtasks;

    public Epic(String title, String description) {
        super(title, description);
        this.subtasks = new Subtask[5];
    }

    public void add(Subtask subtask) {
        for (int i = 0; i < subtasks.length; i++) {
            if (subtasks[i] == null) {
                subtasks[i] = subtask;
                return;
            }
        }
    }

//    public void updateStatus(){
//        for (int i = 0; i < subtasks.length; i++) {
//            if (subtasks[i] == "new") {
//                this.subtasks[i] = "new";
//                return;
//            }else if ()
//            }
//        }

    public Subtask[] getSubtasks() {
        return subtasks;
    }
}
