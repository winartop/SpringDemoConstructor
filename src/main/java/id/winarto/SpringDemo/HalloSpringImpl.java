package id.winarto.SpringDemo;


import org.springframework.stereotype.Component;

@Component
public class HalloSpringImpl implements HalloSpringService {
    @Override
    public void sayHallo() {
        System.out.println("Hallo Kita Belajar Spring Boot Dengan mudah dan pasti bisa");
    }
}
