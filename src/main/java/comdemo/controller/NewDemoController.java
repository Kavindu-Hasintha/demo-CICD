package comdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v2/demo")
public class NewDemoController {

    @GetMapping
    public ResponseEntity<String> getDemo() {
        return ResponseEntity.ok("testing....v2.....");
    }
}
