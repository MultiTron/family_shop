public class IceCreamApp {
    public static void main(String[] args) {
        IceCreamShop shop = IceCreamShop.getInstance();

        IceCream ic1 = shop.getIceCream(IceCreamType.Vanilla, IceCreamTopping.Glaze);
        IceCream ic2 = shop.getIceCream(IceCreamType.Strawberry, IceCreamTopping.Sticks);
        IceCream ic3 = shop.getIceCream(IceCreamType.Chocolate);
    }
}
