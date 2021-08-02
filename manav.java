import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut kilo gir:");
        armut = input.nextDouble();
        System.out.println("elma kilo gir:");
        elma = input.nextDouble();
        System.out.println("domates kilo gir:");
        domates = input.nextDouble();
        System.out.println("muz kilo gir:");
        muz = input.nextDouble();
        System.out.println("patlican kilo gir:");
        patlican = input.nextDouble();

        double toplam = elma + armut +domates +muz + patlican;
        System.out.println("toplam kg :" + toplam );
    }
}
