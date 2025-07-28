package ru.netology.hw_jdbc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.netology.hw_jdbc.service.OrderService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/fetch-product")
    public List<String> getProducts(@RequestParam("name") String customerName) {
        return orderService.getProducts(customerName);
    }
}
