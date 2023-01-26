
/**
 * @Program name - JamesPow_Proj1
 * @author - James Pow
 * @Date created - 1/26/2023
 * Program Description - This program displays the projected
 * US population for each of the next five years.
 */
public class JamesPow_Proj01
{
    public static final int SECONDS_IN_YEAR = 365 * 24 * 60 * 60;
    public static int population = 312032486;
    public static void main(String[] args) {
        System.out.print("Population ");
        // outer loop runs 1 - 5 (5 years)
        // inner loop runs through seconds in year,
        // using modulus to add/subtract lives
        for (int year = 1; year < 6; year++) {
            for (int second = 0; second < SECONDS_IN_YEAR; second++) {
                if (second % 7 == 0) { // a new birth 
                    population++;
                } else if (second % 13 == 0) { // a new death
                    population--;
                } else if (second % 45 == 0) { // a new immigrant
                    population++;
                }
            }
            if (year < 2) {
                System.out.println("after " + year + " year = " + population);
            } else {
                System.out.println("           after " + year + " years = " + population);

            }
        }
    }
}
