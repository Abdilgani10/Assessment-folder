import java.util.Scanner;

public class calculate {

    public static void main(String[] args) {
        calculate c = new calculate();

        c.repeatCalc();

    }

    Scanner input = new Scanner(System.in);


    public void repeatCalc() {

        while (1>0) {
            calculator();
        }
    }

    public void calculator() {
        double result=0;
        String problm = "";
        System.out.println("Use: \n\"/\" to divide \n\"x\" to multiply \n\"+\" for addition \n\"-\" to substract \n\n>");


        problm = input.nextLine();



        for (int i=0; i<problm.length();i++) {

            if (problm.charAt(i)=='/') {

                result = Double.parseDouble(problm.substring(0, i)) / Double.parseDouble(problm.substring(i+1,problm.length()));

            }

            if  (problm.charAt(i)=='-') {
                result = Double.parseDouble(problm.substring(0, i)) + Double.parseDouble(problm.substring(i,problm.length()));

            }

            else if  (problm.charAt(i)=='x') {
                result = Double.parseDouble(problm.substring(0, i)) * Double.parseDouble(problm.substring(i+1,problm.length()));

            }

            else if  (problm.charAt(i)=='+') {

                result = Double.parseDouble(problm.substring(0, i)) + Double.parseDouble(problm.substring(i,problm.length()));

            }
        }




        System.out.println("Answer is: " + result);
    }

}