import org.springframework.context.annotation.Bean;

public class BeanConfigFirefly {
    @Bean
    public Lighter lighter() {
        return new Firefly() {
        };
    }
    @Bean
    public Light light(Lighter lighter) {
        Light light=new Light();
        light.setLighter(lighter);
        return light;
    }
}
