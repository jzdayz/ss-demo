package io.github.jzdayz.ssdemo;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @Secured("ADMIN")
    @GetMapping("/test")
    public Object test(){
        return "OK";
    }

}
