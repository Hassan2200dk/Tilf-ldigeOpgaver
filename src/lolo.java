public class lolo {

    public static void main(String[] args) {


        checkEnding("halloy", "lloy");
        System.out.println("op over");
        String first = "halllo";
        String second = "lloy";

        int counter = 0;

        String s = "checker";
        int j = 0;
        for (int i = first.length()-second.length(); i <first.length() ; i++) {

                if (second.charAt(j)==first.charAt(i)){
                    s ="true";
                    j++;
                    counter++;
                }else {
                    s ="false";
                    j++;
                }


            }
        System.out.println(counter);
        System.out.println(s);
            }
            public static boolean checkEnding(String s, String q){

                int counter = 0;


                int j = 0;
                for (int i = s.length()-q.length(); i <s.length() ; i++) {

                    if (q.charAt(j)==s.charAt(i)){
                        j++;
                        counter++;
                    }else {
                        j++;
                    }

                }

                if (counter==q.length()) {
                    System.out.println(true);
                    return true;

                }else
                    System.out.println(false);
                    return false;


            }
        }

