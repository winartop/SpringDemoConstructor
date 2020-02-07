package id.winarto.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);

		//untuk memanggil controller pada getBean yang dipanggil adalah nama class Controllernya
		HalloSpringController halloSpringController = (HalloSpringController) context.getBean("halloSpringController");

		//untuk mencetak pesan yang ada di implementasi
		halloSpringController.getMessage();

		//ini adalah contoh program pemanggilan injection pada Constructor
	}


}
