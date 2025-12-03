public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) {
        zippo("rattle", 13); // 1
    }

    public static void baffle(String blimp) {
        System.out.println(blimp); // 7
        zippo("ping", -5); // 8
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) { // 2, 9
            System.out.println(quince + " zoop"); // 10
        } else { // 3
            System.out.println("ik"); // 4
            baffle(quince); // 5
            System.out.println("boo-wa-ha-ha"); // 6
        }
    }
}

/*

    Sorular:
    Programın tam çıktısı : 
        ik
        rattle
        ping zoop
        boo-wa-ha-ha
    
    baffle metoduna ilk gönderilen blimp parametresinin değerini yazın. : 
        "rattle" stringi.
*/
