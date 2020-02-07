package id.winarto.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HalloSpringController {

    //menggunakan method custractor
    private HalloSpringService halloSpringService;

    //custractornya
    @Autowired
    public HalloSpringController(HalloSpringService halloSpringService) {
        this.halloSpringService = halloSpringService;
    }

    public void getMessage(){
        halloSpringService.sayHallo();
    }
}
