class Seller {
    private Shop shop;

    public Seller(Shop shop) {
        this.shop = shop;
    }

    public synchronized void receiveAuto() {
        try {
            Thread.sleep(3000);
            shop.getAuto().add(new Auto());
            System.out.println("Производитель Toyota выпустил 1 авто");
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized Auto sellAuto() {
        try {
            while (shop.getAuto().isEmpty()) {
                System.out.println("в автосалоне нет машин");
                wait();
            }
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " покупает машину");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("в автосалоне нет машин");
        return shop.getAuto().remove(0);
    }
}