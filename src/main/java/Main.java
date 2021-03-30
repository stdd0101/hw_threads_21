public class Main {
    public static void main(String[] args) {
        final Shop shop = new Shop();
//        new Thread(null, shop::sellAuto, "Покупатель").start();
//        new Thread(null, shop::acceptAuto, "Поставщик").start();
//
//        new Thread(null, shop::sellAuto, "Покупатель 1").start();
//        new Thread(null, shop::acceptAuto, "Поставщик").start();
//
//        new Thread(null, shop::sellAuto, "Покупатель 2").start();
//        new Thread(null, shop::acceptAuto, "Поставщик").start();
//
//        new Thread(null, shop::sellAuto, "Покупатель 3").start();
//        new Thread(null, shop::acceptAuto, "Поставщик").start();

        for(int i = 1; i < 10; i++) {
            new Thread(null, shop::sellAuto, "Покупатель" + i).start();
            new Thread(null, shop::acceptAuto, "Поставщик").start();
        }

    }
}
