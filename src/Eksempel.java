import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Eksempel {

    public static void main(String[] args) throws FileNotFoundException {

        PrintStream eksempel = new PrintStream(new File("C:\\Java textfiles\\yasineErGlad.txt"));

        eksempel.println("hejsa");
        eksempel.println("goddagsen");
        eksempel.println("Yasin er klassens bedste programmør");
        eksempel.println("Ahmad elsker visual paradigm");
        eksempel.println("brazil vinder vm");

    }
}
