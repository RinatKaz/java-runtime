package Lesson25;

public abstract class Transport {
    String name;
    String type;
    int wheel;
    int index;

    public Transport(String name, String type, int wheel, int index) {
        this.name = name;
        this.type = type;
        this.wheel = wheel;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
