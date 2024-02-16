package Home12MassivEx;

public class Main {
    public static void main(String[] args) {
        int vedomost [] = {100000,2000,999999, 545000, 200000, 40000, 240000, 300000, 400000};
        int fondzarplati=0;
        int minzp=vedomost[0];
        int maxzp=vedomost[0];
        for (int i = 0; i < vedomost.length; i++) {
            fondzarplati+=vedomost[i];
            if (minzp>vedomost[i]) {
                minzp = vedomost[i];
            }
            if (maxzp<vedomost[i]) {
                maxzp = vedomost[i];
            }

        }
        System.out.println("фонд зп "+fondzarplati);
        System.out.println("Минимальная зп "+minzp);
        System.out.println("Максимальная зп "+maxzp);
    }
}
