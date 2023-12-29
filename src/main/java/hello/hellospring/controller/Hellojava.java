package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Hellojava {
    @GetMapping("/")
    @ResponseBody
    public String helloString() {
        String helloworld = "안녕하세요";
        return helloworld;
    }
}
