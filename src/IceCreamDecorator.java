public abstract class IceCreamDecorator implements IceCream{
    private final IceCream planeIceCream;
    private final IceCreamTopping topping;

    public IceCreamDecorator(IceCream planeIceCream, IceCreamTopping topping) {
        this.planeIceCream = planeIceCream;
        this.topping = topping;
    }

    public void getIceCream() {
        System.out.println(planeIceCream.toString() + this);
    }

    @Override
    public String toString() {
        return " with Chocolate " + topping;
    }
}
