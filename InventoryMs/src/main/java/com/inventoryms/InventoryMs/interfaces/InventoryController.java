package com.inventoryms.InventoryMs.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/inventory")
public class InventoryController {

    @GetMapping
    public String getInventory() {
        System.out.println("InventoryMS is working");
        return "Inventory MS is working.";
    }
}
