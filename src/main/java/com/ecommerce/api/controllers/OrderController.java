//package com.ecommerce.api.controllers;
//
//import com.ecommerce.api.dtos.OrderDTO;
//import com.ecommerce.api.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/orders")
//public class OrderController {
//
//    @Autowired
//    private OrderService orderService;
//
//    @GetMapping("/{id}")
//    public ResponseEntity<OrderDTO> getOrderById(@PathVariable Long id) {
//        return ResponseEntity.ok(orderService.getOrderById(id));
//    }
//
//    @GetMapping
//    public ResponseEntity<List<OrderDTO>> getAllOrders() {
//        List<OrderDTO> list = orderService.getAllOrders();
//        return ResponseEntity.ok(list);
//    }
//
//    @PostMapping
//    public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderDTO orderDTO) {
//        return ResponseEntity.created(orderService.createOrder(orderDTO));
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<OrderDTO> updateOrder(@PathVariable Long id, @RequestBody OrderDTO orderDTO) {
//        return ResponseEntity.ok(orderService.updateOrder(id, orderDTO));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
//        orderService.deleteOrder(id);
//        return ResponseEntity.noContent().build();
//    }
//}
