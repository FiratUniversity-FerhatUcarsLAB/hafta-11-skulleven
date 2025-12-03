/**
 * Ad Soyad: Melik Buğra Kara
 * Öğrenci No: 250541110
 */


public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor? 

        int deger = getNumber();

        System.out.println("test");


        // 2) void metodu ifade icinde kullanin -> ne oluyor?


        System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.

        // 1- Kullanmak zorunda değiliz herhangi bir hataya sebep vermiyor...
        // 2- void tipli bir metodun bu formatta kullanılamayacağıyla ilgili bir hata veriyor.
    }
}
