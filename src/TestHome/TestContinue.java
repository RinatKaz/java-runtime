package TestHome;

public class TestContinue {
    public static void main(String[] args) {
        int num = 0;

        while (num<=20){
            num++;
            if (num%2==0){

                break;
            }
            System.out.println(num);
        }
    }
}
