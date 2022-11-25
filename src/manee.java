import java.util.Random;

public class manee {
    public static void main(String[] args) {


        String fullName = "Jesper Kludesen";

        String[] container = fullName.split(" ");

        String lastName = " ";
        String firstName = " ";
        for (int i = 0; i < container.length; i++) {
            for (int j = i + 1; j < container.length; j++) {
                firstName = container[i].substring(0, 2);
            }
            // System.out.println(container[i].substring(0,2));

            lastName = container[i].substring(0, 2);
        }
        System.out.println(firstName);
        System.out.println(lastName);


        Random random = new Random();

        int randomNumber = 1;

            randomNumber = random.nextInt(1000)+2000;


        String fourDigits = Integer.toString(randomNumber);


        System.out.println(firstName + lastName + fourDigits);
    }


}
