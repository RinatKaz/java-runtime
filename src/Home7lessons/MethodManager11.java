package Home7lessons;

public class MethodManager11 {
    void converterSecondsToTime(int seconds) {
        int hours = seconds/3600;
        int minuts = (seconds - hours*3600)/60;
        int secundss= seconds - hours*3600 - minuts*60;
        System.out.println(hours + " часа "+ minuts+ " минут " + secundss + " секунд");
        return;
    }
}
