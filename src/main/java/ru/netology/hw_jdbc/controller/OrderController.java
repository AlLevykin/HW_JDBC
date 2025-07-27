package ru.netology.hw_jdbc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hw_jdbc.service.OrderService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/fetch-products")
    public List<String> getProducts(@PathVariable String name) {
        return orderService.getProducts(name);
    }
}
