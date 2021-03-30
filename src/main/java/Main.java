public class Main {
    public static void main(String[] args) {
        final Shop shop = new Shop();
        //  Покупатель, чья работа заключается в том, чтобы купить хлеб - shop.sellBread()
        new Thread(null, shop::sellAuto, "Покупатель").start();
        new Thread(null, shop::acceptAuto, "Поставщик").start();

        new Thread(null, shop::sellAuto, "Покупатель 1").start();
        new Thread(null, shop::acceptAuto, "Поставщик").start();

        new Thread(null, shop::sellAuto, "Покупатель 2").start();
        new Thread(null, shop::acceptAuto, "Поставщик").start();

        new Thread(null, shop::sellAuto, "Покупатель 3").start();
        new Thread(null, shop::acceptAuto, "Поставщик").start();

    }
}
