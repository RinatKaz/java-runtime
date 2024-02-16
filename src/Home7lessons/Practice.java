package Home7lessons;

public class Practice {
    public static void main(String[] args) {
        String findFilm = find();
        System.out.println( "Самый кассовый фильм "+ findFilm);
    }
    public static String find (){
        String film1= "Titanic";
        int income1 = 2194;

        String film2 = "Avatar";
        int income2= 2810;

        String film3 = "The Dark Knight";
        int income3 = 1084;

        if (income1>income2 && income1>income3){
            return film1;
        }else if (income2>income3 && income2>income1){
            return film2;
        }else {
            return film3;
        }
    }
}
