public class IceCreamShop {
    private static IceCreamShop iceCreamShop;
    private IceCreamShop() { }

    public IceCream getIceCream(IceCreamType type){
        IceCream iceCream = makeIceCream(type);
        if (iceCream != null){
            iceCream.getIceCream();
        }
        return iceCream;
    }

    public IceCream getIceCream(IceCreamType type, IceCreamTopping topping) {
        IceCream iceCream = addTopping(topping, makeIceCream(type));
        if (iceCream != null){
             iceCream.getIceCream();
         }
        return iceCream;
    }

    private IceCream addTopping(IceCreamTopping topping, IceCream iceCream) {
        switch (topping){
            case Glaze ->
                    iceCream = new GlazeIceCreamDecorator(iceCream);
            case Sticks ->
                    iceCream = new SticksIceCreamDecorator(iceCream);
         }
        return iceCream;
    }

    public IceCream makeIceCream(IceCreamType type){
        return switch (type) {
            case Vanilla ->
                    new VanillaPlaneIceCream();
            case Chocolate ->
                    new ChocolatePlaneIceCream();
            case Strawberry ->
                    new StrawberryPlaneIceCream();
        };
    }

    public static IceCreamShop getInstance() {
        if (iceCreamShop == null){
            iceCreamShop = new IceCreamShop();
        }
        return iceCreamShop;
    }
}
