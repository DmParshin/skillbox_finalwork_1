package main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ApiPostController {
    @RequestMapping("/api/post/*")
    public String index(){
        return (new Date()).toString() + " ../api/post/*";
    }
}
