package co.develhope.demo_cors_example.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CorsController {

    @GetMapping("/{name}")
    public String getName(@RequestParam String name){
        return name;
    }

    @PostMapping("/reverse")
    public String reverseName(@RequestBody String name) {
        return new StringBuilder(name).reverse().toString();
    }
}