package com.restaurant.restaurant_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Restaurant Backend Running Successfully!";
    }
}








// @RestController
// public class HomeController {

//     @GetMapping("/")
//     public String home() {
//         return "Restaurant Backend Running Successfully!";
//     }
// }
// @RestController
// @RequestMapping("/api")
// public class HomeController {

//     @GetMapping("/welcome")
//     public String welcome() {
//         return "Restaurant API Working";
//     }
// }