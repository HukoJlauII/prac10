import org.springframework.context.annotation.Bean;

public class BeanConfigFlashlight {
    @Bean
    public Lighter lighter() {
        return new FlashLight() {
        };
    }
    @Bean
    public Light light(Lighter lighter) {
        Light light=new Light();
        light.setLighter(lighter);
        return light;
    }
}
