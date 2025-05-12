public class SticksIceCreamDecorator extends IceCreamDecorator {
    public SticksIceCreamDecorator(IceCream planeIceCream) {
        super(planeIceCream, IceCreamTopping.Sticks);
    }

    @Override
    public void getIceCream() {
        super.getIceCream();
    }
}
