package life.bentuli.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//controller允许这个类去接受前端的请求
public class HelloController {
@GetMapping("hello")
    public String hello(@RequestParam(name="name") String name, Model model){
    model.addAttribute("name", name);
    return "hello";

    }
}
