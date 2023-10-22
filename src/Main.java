import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a measurement in meters: ");
        double meters = scanner.nextDouble();

        MeterMeasurement meterMeasurement = new MeterMeasurement(meters);

        LengthMeasurement adapter = new LengthMeasurementAdapter(meterMeasurement);

        System.out.println("Meters: " + meterMeasurement.getMeters() + " m");
        System.out.println("Feet: " + adapter.getMeasurement() + " ft");

        scanner.close();
    }
}
