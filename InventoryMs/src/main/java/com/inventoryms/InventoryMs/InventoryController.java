package com.inventoryms.InventoryMs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/inventory")
public class InventoryController {

    @GetMapping
    public String getInventory() {
        System.out.println("1 - InventoryMS is working.");
        System.out.println("2 - Now, it's been changed.");
        System.out.println("3 - Live Reload's joined the gang.");
        return "Inventory MS is working but with some changes and live reloading.";
    }
}
