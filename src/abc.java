import java.lang.reflect.Array;

public class abc {

    private static int idAdder = 1;
    private int id;


    public abc(){
        id = idAdder++;
    }

    public static void main(String[] args) {

        String [] array = {"Hejsa", "hello", "gutagen", "gutagen", "Hejsa", "Ahmadiyaaaa", "idfjdsipgfhipfxgpdfg"};

        new abc().sejmetode(array);

        String ord = "Hello world";
       // System.out.println(ord.substring(0,1));
        //System.out.println(ord.substring(11,11));

      String ordet = "Hello world";
        for (int i = 0; i <ordet.length() ; i++) {
            if (ordet.charAt(i) == 'o'){
                //System.out.println(ordet.charAt(i) + " Det er placet ved indeksnummer " + i );
            }

        }
        int whiteSpaceCounter = 0;
        String ordet2 = "Hello world, hva så Yasine hvordan skærer den";
        for (int i = 0; i <ordet2.length() ; i++) {

            if (ordet2.charAt(i)==' '){

                whiteSpaceCounter++;
            }
        }
        System.out.println(whiteSpaceCounter);



    }





























    public void sejmetode(String [] something){

        String placeholder = "";
        for (int i = 0; i <something.length ; i++) {

            // System.out.println(array[i]);

            if (something[i].length()>placeholder.length()){
                placeholder=something[i];
            }
            //System.out.println(array[i]);

        }
        System.out.println("Det længeste ord er " + placeholder );
    }
}
