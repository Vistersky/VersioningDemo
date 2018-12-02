package pl.vistersky.versioningdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningDemoController {
    @GetMapping("/versioning")
    public String saySomething(){
        return "VersioningDemo!";
    }
}
