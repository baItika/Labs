package lab1.com.company.Task10;

public class Main {

    public static void main(String[] args) {
        int n = 7;
        final Day[] days = new Day[n];

//        days[0] = new Day (dayName[0]);
//        days[1] = new Day (NameOfDay.TUESDAY,TypeOfWeather.RAINY,18.7,850,74);
//        days[2] = new Day (NameOfDay.WEDNESDAY,TypeOfWeather.CLOUDY,19.8,550,68);
//        days[3] = new Day (NameOfDay.THURSDAY,TypeOfWeather.SUNNY,25.3,550,54);
//        days[4] = new Day (NameOfDay.FRIDAY,TypeOfWeather.HOT,31.9,400,34);
//        days[5] = new Day (NameOfDay.SATURDAY,TypeOfWeather.WARM,26.0,750,68);
//        days[6] = new Day (NameOfDay.SUNDAY,TypeOfWeather.COLD,15.8,550,84);
//        printWeatherCalendar(days);

        final Object[]day = new Day[7];
        day[0] = new Day("Monday");


//    private static void outWeatherCalendar(final Day [] days){
//        for (int i = 0; i < days.length; i++) {
//            System.out.println(days[i]);
//        }
//    }
        System.out.println(day[0]);
    }
}
