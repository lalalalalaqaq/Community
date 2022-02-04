package community.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lalalalaqaq
 * @date : 2022-02-04
 **/
@RestController
@RequestMapping("/test")
public class testcontroller {
    @GetMapping("/helloWorld")
    public String helloworld(){
        return "helloWorld";
    }
}

