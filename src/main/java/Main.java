import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext1=new AnnotationConfigApplicationContext(BeanConfigLamp.class);
        Light light1=applicationContext1.getBean(Light.class);
        light1.lights();

        ApplicationContext applicationContext2=new AnnotationConfigApplicationContext(BeanConfigFlashlight.class);
        Light light2=applicationContext2.getBean(Light.class);
        light2.lights();

        ApplicationContext applicationContext3=new AnnotationConfigApplicationContext(BeanConfigFirefly.class);
        Light light3=applicationContext3.getBean(Light.class);
        light3.lights();
    }
}
