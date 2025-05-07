package comdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/demo")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> getDemo() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/testing")
    public ResponseEntity<String> getDemo2() {
        return ResponseEntity.ok("testing...");
    }
}
