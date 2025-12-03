public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // TODO

        return (a*b) + c;
    }

    public static double expSum(double x) {
        // TODO
        return (x * Math.exp(-x)) + (Math.sqrt(1 - Math.exp(-x)));
    }

    public static void main(String[] args) {
        // TODO: test methods
        System.out.println("Multadd test : " + multadd(12, 42, 23));
        
        double sin45 = Math.sin(Math.toDegrees(Math.PI / 4));
        double cos45 = Math.cos(Math.toDegrees(Math.PI / 4));

        double islem1 = multadd(cos45, 0.5, 0); // cos(45) / 2 işlemini multadd ile yapıyor.

        double sonuc1 = multadd(islem1, 1, sin45);

        double sonuc2 = multadd(Math.log10(10), 1, Math.log10(20));

        double sonuc3 = expSum(3);

        System.out.printf("Sonuc 1 : %.2f \n", sonuc1);
        System.out.printf("Sonuc 2 : %.2f \n", sonuc2);
        System.out.printf("Sonuc 3 : %.2f \n", sonuc3);
    }
}
