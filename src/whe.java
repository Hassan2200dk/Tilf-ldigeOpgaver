import java.util.Scanner;

public class whe {
    public static void main(String[] args) {

        //Formands kode

        //brugernavn = Ahmad
        // kode = ahmadersej

        String s = "";
        String p = "";
        Scanner in = new Scanner(System.in);
        int counter = 0;

        while (true) {

            System.out.println("Indtast din brugernavn:");

            s = in.nextLine();

            System.out.println("Indtast din kode");
            p = in.nextLine();

            if(s.equalsIgnoreCase("Træner") && p.equalsIgnoreCase("træner123")){
                System.out.println("succes");
                System.out.println("du er nu logget ind som træner");
                break;
            }


            if (s.equalsIgnoreCase("kasser") && p.equalsIgnoreCase("kasser123")) {
                System.out.println("Succes");
                System.out.println("du er nu logget ind som kasser");
                break;

            }
            if (s.equalsIgnoreCase("formand") && p.equalsIgnoreCase("formand123")) {
                System.out.println("Succes");
                System.out.println("du er nu logget ind som formand");
                break;
            } else {
                System.out.println("prøv igen");
                counter++;
                if (counter == 3) {
                    System.out.println("Du har prøvede alt for mange");
                    break;
                }
            }


        }
    }
}
