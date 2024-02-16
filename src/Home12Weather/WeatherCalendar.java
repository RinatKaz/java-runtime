package Home12Weather;

public class WeatherCalendar {

        String month ;
        int numberOfDays;
        int rainyDays;
        int year =2023 ;
        boolean isRainyMonth;

        // Увеличить переменную rainyDays на единицу
        public void addRainyDay() {
                rainyDays+=1;
                if (rainyDays>15){
                        isRainyMonth=true;
                        return;
                }
        }

    }



