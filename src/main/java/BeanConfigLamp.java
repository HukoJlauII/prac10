import org.springframework.context.annotation.Bean;


public class BeanConfigLamp {
    @Bean
    public Lighter lighter() {
        return new Lamp() {
        };
    }
    @Bean
    public Light light(Lighter lighter) {
        Light light=new Light();
        light.setLighter(lighter);
        return light;
    }

}
