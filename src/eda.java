public class eda {
    public static void main(String[] args) {
        double [] hejsa = {1,2,3,4,6,6564};


        double s = 0;
        double q = 10000000;

        for (int i = 0; i <hejsa.length ; i++) {
            if (s<hejsa[i]){
                s=hejsa[i];
            }

            if(q>hejsa[i]){
                q=hejsa[i];
            }

        }




        System.out.println("Det største tal er " + s);
        System.out.println("Det mindste tal er " + q);




    }

    public static double[] minMax(double[] arr) {

        double[] hejsa = {1, 2, 3, 4, 6, 6564};


        double s = arr[0];
        double q = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (s < arr[i]) {
                s = arr[i];
            }

            if (q > arr[i]) {
                q = arr[i];
            }

        }


        System.out.println("Det største tal er " + s);
        System.out.println("Det mindste tal er " + q);

        double[] nyArray ={q,s};


        return nyArray;
    }
}
