import java.util.*;

class WeatherRecord {
    String location, date;
    double temperature, humidity, windSpeed;

    WeatherRecord(String location, String date, double temperature, double humidity, double windSpeed) {
        this.location = location;
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    void display() {
        System.out.println(location + " | " + date + " | Temp: " + temperature + "°C | Humidity: " + humidity + "% | Wind: " + windSpeed + " km/h");
    }
}

public class WeatherMonitoringSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<WeatherRecord> records = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Record  2. Update Record  3. View Records  4. Exit");
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.print("Location: "); 
                    String loc = sc.next();
                    System.out.print("Date: "); 
                    String date = sc.next();
                    System.out.print("Temperature: "); 
                    double temp = sc.nextDouble();
                    System.out.print("Humidity: "); 
                    double hum = sc.nextDouble();
                    System.out.print("Wind Speed: "); 
                    double wind = sc.nextDouble();
                    records.add(new WeatherRecord(loc, date, temp, hum, wind));
                }
                case 2 -> {
                    System.out.print("Location: ");
                    String loc = sc.next();
                    System.out.print("Date: "); 
                    String date = sc.next();
                    records.stream().filter(r -> r.location.equals(loc) && r.date.equals(date)).findFirst().ifPresentOrElse(r -> {
                                System.out.print("New Temperature: "); 
                                r.temperature = sc.nextDouble();
                                System.out.print("New Humidity: "); 
                                r.humidity = sc.nextDouble();
                                System.out.print("New Wind Speed: "); 
                                r.windSpeed = sc.nextDouble();
                    }, () -> System.out.println("Record not found"));
                }
                case 3 -> records.forEach(WeatherRecord::display);
                case 4 -> { 
                    sc.close(); 
                    return; 
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}