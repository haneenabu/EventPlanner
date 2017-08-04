import javafx.beans.binding.Bindings;
import models.Event;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/4/17.
 */
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Haneen's Event Planning Service!" + '\n' + "You will be prompted with a few event options to get you an accurate event quote!" + '\n');
        try{
            String again;
            do{
                //Guest Price
                System.out.println("Enter the number of your expected attendees: ");
                int guestNumInput = Integer.parseInt(bufferedReader.readLine());
                Event event = new Event();
                int finalCost = event.costOfGuest(guestNumInput);
                System.out.println("Your cost for " + guestNumInput+ " guests would amount to $" + finalCost +"." + '\n' + "Select the Enter key to continue.");
                System.in.read(); //wait for the user to select any key before displaying more options

                //Food Price
                System.out.println("Choose one of the following food options, by entering the corresponding number: " + '\n' + "1. Italian Cuisine" + '\n' + "2. Asian Fusion" + '\n' + "3. Mediterranean Grill" + '\n' + "4. All American" + '\n' + "5. Indian Experience");
                int foodChoiceInput = Integer.parseInt(bufferedReader.readLine());
                finalCost += event.calculateFoodCost(foodChoiceInput);
                System.out.println('\n' + "Your total cost for food option " +foodChoiceInput+ " and " +guestNumInput + " guest(s) is $" +finalCost + "."+ '\n' + "Select the Enter key to continue.");
                System.in.read();

                //Drinks Price
                System.out.println("Choose one of the following drink options, by entering the corresponding number: " + '\n' + "1. Italian Sodas" + '\n' + "2. Thai Tea" + '\n' + "3. Mint Lemonade" + '\n' + "4. Soda Assortments" + '\n' + "5. Chai and Lemon Water");
                int drinkChoice = Integer.parseInt(bufferedReader.readLine());
                finalCost += event.calculateDrinksCost(drinkChoice);
                System.out.println('\n' + "Your total cost for drink option "+ drinkChoice + ", food option " +foodChoiceInput+ " and " +guestNumInput + " guest(s) is $" +finalCost + "." + '\n' + "Select the Enter key to continue.");
                System.in.read();

                //Entertainment Price
                System.out.println("Choose one of the following entertainment options, by entering the corresponding number: " + '\n' + "1. DJ" + '\n' + "2. Live Band" + '\n' + "3. No Entertainment/You will provide your own");
                int entertainmentChoice = Integer.parseInt(bufferedReader.readLine());
                finalCost += event.calculateEntertainmentCost(entertainmentChoice);
                System.out.println('\n' + "Your total cost for entertainment option " + entertainmentChoice + ", drink option "+ drinkChoice + ", food option " +foodChoiceInput+ " and " +guestNumInput + " guest(s) is $" +finalCost + "." + '\n' + "Select the Enter key to continue.");
                System.in.read();

                System.out.println("Would you like to try again (Yes | No)? ");
                again = bufferedReader.readLine();
            } while (again.equals("Yes"));




        }catch (IOException e){
           e.printStackTrace();
        }
    }
}
