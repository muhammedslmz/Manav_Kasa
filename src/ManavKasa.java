import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        double  pricearmut=2.14, priceelma=3.67, pricedomates=1.11, pricemuz=0.95,pricepatlican=5;

        System.out.print("Kaç kg armut aldınız?");
        double armut = imput.nextDouble();

        System.out.print("Kaç kg elma aldınız?");
        double elma = imput.nextDouble();

        System.out.print("Kaç kg domates aldınız?");
        double domates = imput.nextDouble();

        System.out.print("Kaç kg muz aldınız?");
        double muz = imput.nextDouble();

        System.out.print("Kaç kg patlıcan aldınız?");
        double patlican = imput.nextDouble();

        double total= armut*pricearmut+elma*priceelma+domates*pricedomates+muz*pricemuz+patlican*pricepatlican;
        System.out.println("Toplam tutar: "+total);





    }
}
