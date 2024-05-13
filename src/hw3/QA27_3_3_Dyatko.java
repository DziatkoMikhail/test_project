package hw3;

public class QA27_3_3_Dyatko {
    public static void main(String[] args) {
        double sumofArray1 = 0;
        double sumOfArray2 = 0;
        int[] Array1 = new int[5];
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = (int) (Math.random() * 6);
            System.out.print(Array1[i] + " ");
            sumofArray1 += (double) Array1[i] / Array1.length;
        }
        System.out.println(" ");
        System.out.println(sumofArray1 + " - Average number of first massive");
        int[] Array2 = new int[5];
        for (int i = 0; i < Array2.length; i++) {
            Array2[i] = (int) (Math.random() * 6);
            System.out.print(Array2[i] + " ");
            sumOfArray2 += (double) Array2[i] / Array2.length;
        }
        System.out.println(" ");
        System.out.println(sumOfArray2 + " - Average number of second massive");

        if (sumofArray1 == sumOfArray2) System.out.println("Average numbers of massives are equal");
        else {
            if (sumofArray1 > sumOfArray2)
                System.out.println("Average number of first massive is more than average number of second massive");
            else System.out.println("Average number of second massive is more than average number of first massive");
        }
    }
}
