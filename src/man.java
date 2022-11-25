public class man {
    public static void main(String[] args) {

        String test = "hqll2600";

       // System.out.println(test.substring(0,4));

//        System.out.println(test.substring(4));

        String s = "";
        String q = "0123456789";

        int counterForLetters = 0;

        for (int i = 0; i <4 ; i++) {
            System.out.println(test.charAt(i));
            for (char ch = 'a'; ch < 'z'; ch++) {
                if (test.charAt(i) == ch) {
                    counterForLetters++;
                }
            }
        }
        int counter = 0;
        for (int i = 4; i <8 ; i++) {

           // System.out.println(test.charAt(i));
            for (int j = 0; j <q.length() ; j++) {

                if (test.charAt(i)==q.charAt(j)){
                    counter++;
                }
                if (counter==4&& counterForLetters==4){
                    s = "this is true";
                }else {
                    s = "this is false";
                }
            }
        }
        System.out.println(counterForLetters);
        System.out.println(counter);
        System.out.println(s);
                }
            }



