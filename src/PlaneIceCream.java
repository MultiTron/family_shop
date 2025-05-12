public abstract class PlaneIceCream implements IceCream{
    protected final IceCreamType type;

    public PlaneIceCream(IceCreamType type) {
        this.type = type;
    }

    public void getIceCream() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "This ice cream is " + type;
    }
}
