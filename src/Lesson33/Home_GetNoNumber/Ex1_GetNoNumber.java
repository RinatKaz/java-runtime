package Lesson33.Home_GetNoNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1_GetNoNumber {
    public static void main(String[] args) {
        List<Integer> user1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> user2 = Arrays.asList(3, 4, 5, 6, 7);

        List<Integer> noNumber = getNoNumber(user1, user2);
        System.out.println(noNumber);
    }

    static List<Integer> getNoNumber(List<Integer> list1, List<Integer> list2) {
        List<Integer> user3 = new ArrayList<>();
        for (Integer i : list1) {
            if (!list2.contains(i)) {
                user3.add(i);
            }
        }


        for (Integer i : list2) {
            if (!list1.contains(i)) {
                user3.add(i);
            }
        }
        return user3;
    }
}
