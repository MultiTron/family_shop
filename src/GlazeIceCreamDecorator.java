public class GlazeIceCreamDecorator extends IceCreamDecorator {
    public GlazeIceCreamDecorator(IceCream planeIceCream) {
        super(planeIceCream, IceCreamTopping.Glaze);
    }

    @Override
    public void getIceCream() {
        super.getIceCream();
    }
}
