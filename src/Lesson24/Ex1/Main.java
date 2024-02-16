package Lesson24.Ex1;

public class Main {
        public static void main(String[] args) {
            String[] names = {"misha", "sasha", "anya"};

            // names={misha, sasha, anya}
            StringBuilder builder = new StringBuilder("names={");
            for (String name : names) {
                builder.append(name)
                        .append(", ");
            }

            builder.append("}");
            String result = builder.toString();
            System.out.println(result);

            User[] users = new User[]{
                    new User("misha", 20),
                    new User("anya", 22),
                    new User("grisha", 28),
                    new User("aldiyar", 35)
            };
            StringBuilder builder1 = new StringBuilder("users=[{");
            for (int i = 0; i < users.length; i++) {
                builder1.append("name: ")
                        .append(users[i].getName())
                        .append(", ")
                        .append("age: ")
                        .append(users[i].getAge()).append(", ");
            }

            builder1.delete(builder1.length()-2,builder1.length());
            builder1.append("}]");
            String result1 = builder1.toString();
            System.out.println(result1);

            }

            // users=[{name: misha, age: 20}, {name: anya, age: 22}, {name: grisha, age: 28}, {name: aldiyar, age: 35}]


        }



    class User {
        private String name;
        private int age;


        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

//string format String Bilding