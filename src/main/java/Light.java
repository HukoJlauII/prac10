public class Light {
    private Lighter lighter;

    public void setLighter(Lighter lighter) {
        this.lighter = lighter;
    }

    public void lights()
    {
        System.out.println("I 'm doing light."+lighter.doLight() );
    }
}
