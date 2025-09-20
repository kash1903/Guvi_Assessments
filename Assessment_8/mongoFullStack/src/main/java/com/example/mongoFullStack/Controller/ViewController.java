package com.example.mongoFullStack.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin(origins = "*")
public class ViewController {

    @GetMapping("/index.page")
    
    public String viewFile(){
        return "index";
    }
    
}
