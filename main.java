import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();
        double costPerHour = sc.nextDouble();

        AirIndia airIndia = new AirIndia(hours, costPerHour);
        KingFisher kingFisher = new KingFisher(hours, costPerHour);
        Indigo indigo = new Indigo(hours, costPerHour);

        System.out.printf("AirIndia Amount : %.2f%n",
                airIndia.calculateAmount());

        System.out.printf("KingFisher Amount : %.2f%n",
                kingFisher.calculateAmount());

        System.out.printf("Indigo Amount : %.2f%n",
                indigo.calculateAmount());

        sc.close();
    }
}