package lab1.com.company.Task10;

public class Weather extends Day{
    String[] weatherType= {"cloudly", "sunny", "rainy"};
    int temperature;

    public Weather(String name, String[] weatherType, int temperature) {
        super(name);
        this.weatherType = weatherType;
        this.temperature = temperature;
    }

    public String getWeather(){
        return weatherType+", "+temperature+" degrees";
    }

    @Override
    public String toString() {
        return getWeather();
    }
}
