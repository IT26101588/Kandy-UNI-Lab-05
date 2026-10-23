import java.util.Scanner;

public class IT26101588Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE_PER_DAY = 48000.0;
        final int MIN_DATE = 1;
        final int MAX_DATE = 31;

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < MIN_DATE || startDate > MAX_DATE || endDate < MIN_DATE || endDate > MAX_DATE) {
            System.out.println("Error: Days must be between 1 and 31");
        } 
        else if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
        } 
        else {
            int daysReserved = endDate - startDate;

            double discountRate = 0;
            if (daysReserved >= 5) {
                discountRate = 20;
            } else if (daysReserved >= 3) {
                discountRate = 10;
            }

            double total = daysReserved * ROOM_CHARGE_PER_DAY;
            total = total - (total * discountRate / 100);

            System.out.println();
            System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
            System.out.println("Number of Days Reserved: " + daysReserved);
            System.out.println("Total Amount to be Paid: " + total);
        }
    }
}