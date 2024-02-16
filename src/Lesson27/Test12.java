package Lesson27;

import java.util.Objects;

public class Test12 {
        String name ="FFF";
        String name2="RRR";

    public Test12(String name, String name2) {
        this.name = name;
        this.name2 = name2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test12 test12 = (Test12) o;
        return Objects.equals(name, test12.name) && Objects.equals(name2, test12.name2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, name2);
    }
}
