package life.bentuli.community.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
//controller允许这个类去接受前端的请求
public class IndexController {
@GetMapping("/")
    public String index(){
    return "index";

    }
}
