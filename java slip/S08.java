import java.util.Scanner;

public class S08 {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean isAM;

    public S08() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.isAM = true;
    }

    public S08(int hours, int minutes, int seconds, boolean isAM) {
        setClock(hours, minutes, seconds, isAM);
    }

    public void setClock(int hours, int minutes, int seconds, boolean isAM) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            this.isAM = isAM;
        } else {
            System.out.println("Invalid time. Setting default time (00:00:00 AM).");
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
            this.isAM = true;
        }
    }

    private boolean isValidTime(int hours, int minutes, int seconds) {
        return (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59) && (seconds >= 0 && seconds <= 59);
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d %s\n", hours % 12, minutes, seconds, isAM ? "AM" : "PM");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Hours (0-23): ");
        int hours = scanner.nextInt();
        System.out.print("Enter Minutes (0-59): ");
        int minutes = scanner.nextInt();
        System.out.print("Enter Seconds (0-59): ");
        int seconds = scanner.nextInt();
        System.out.print("Enter AM (true) or PM (false): ");
        boolean isAM = scanner.nextBoolean();

        S08 clock = new S08(hours, minutes, seconds, isAM);

        // Display the time
        System.out.print("Current Time: ");
        clock.displayTime();

        scanner.close();
    }
}
