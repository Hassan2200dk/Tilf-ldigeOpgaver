public class rando {


    private String fullName;
    private String userId;


    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public String getFullName(){
        return fullName;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public void validUserId(){
        String [] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String digits2 = "0123456789";
        String heello = "hejsa";


        String s = "";
        /*
        if (userId.length()!=8){
            System.out.println("This is an incorrect format");
        }
        else {

            for (int i = 0; i < 4; i++) {
                if (!Character.isDigit(userId.charAt(i))) {
                    s = "Godkendt";
                } else {
                    s = "False";
                }
            }

            System.out.println(s);

         */
        boolean result = userId.substring(4).matches("[0-9]+ ");
            for (int i = 4; i <8 ; i++) {
                if (Character.isDigit(userId.charAt(i))) {
                    s = "Godkendt";
                } else {
                    s = "False";
                }
            }
        System.out.println(result);
        }




    public static void main(String[] args) {

        rando r1 = new rando();

        r1.setFullName("hejsa");
        r1.setUserId("hedf3323");

        r1.validUserId();
    }
}
