import java.util.ArrayList;
import java.util.List;

class Shop {
    //  Продавец
    private Seller seller = new Seller(this);
    private List<Auto> autos = new ArrayList<>(10);

    public Auto sellAuto() {
        return seller.sellAuto();
    }

    public void acceptAuto() {
        seller.receiveAuto();
    }
    List<Auto> getAuto() {
        return autos;
    }
}
