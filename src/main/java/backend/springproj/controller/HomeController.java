package backend.springproj.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @RequestMapping("/api/home")
    public String home(){
        log.info("home controller");
        return "home";
    }
}
