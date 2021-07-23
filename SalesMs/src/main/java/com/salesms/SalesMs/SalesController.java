package com.salesms.SalesMs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sales")
public class SalesController {

    @GetMapping
    public String getSales() {
        System.out.println("1 - SalesMS is working.");
        System.out.println("2 - SalesMS is running with Live Reload.");
        return "Sales MS is working fine and live reloading.";
    }
}
