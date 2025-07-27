package ru.netology.hw_jdbc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.hw_jdbc.repository.OrderRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public List<String> getProducts(String customerName) {
        return orderRepository.getProducts(customerName);
    }
}
