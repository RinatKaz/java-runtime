package Lesson23;

public class Ex2 {
    public static void main(String[] args) {
        String[] names = {
                "Alex", "Drake", "Anya", "Leon", "Adam"
        };
        System.out.println("startsWith");

        for (int i = 0; i < names.length; i++) {
            if (names[i].startsWith("A")) {
                System.out.println(names[i]);
            }
        }
        System.out.println();
        System.out.println("indexOf");
        for (int i = 0; i < names.length; i++) {
            if (names[i].indexOf("A")!=-1) {
                System.out.println(names[i]);
            }
        }

    }
}

//        }
//        System.out.println("----------");

//        for (String name: names){
//            System.out.print(name.startsWith("A")?name+"\n":"");
////            System.out.print(name.indexOf("A",0,1)!=-1?name+"\n":"");
////            System.out.print(name.charAt(0)=='A'?name+"\n":"");



