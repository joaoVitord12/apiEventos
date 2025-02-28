//package com.ecommerce.api.service;
//
//import com.ecommerce.api.dtos.OrderDTO;
//import com.ecommerce.api.entities.Order;
//import com.ecommerce.api.repositories.OrderRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Service;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.util.List;
//
//@Service
//public class OrderService {
//
//    @Autowired
//    private OrderRepository orderRepository;
//
//    public OrderDTO getOrderById(Long id) {
//        Order order = orderRepository.findById(id).orElseThrow(() ->
//                new ResponseStatusException(HttpStatus.NOT_FOUND, "Order not found"));
//        return convertToDTO(order);
//    }
//
//    public List<OrderDTO> getAllOrders() {
//        List<Order> orders = orderRepository.findAll();
//        return orders.stream().map(order -> convertToDTO(order)).toList();
//    }
//
//    public OrderDTO createOrder(OrderDTO orderDTO) {
//        Order order = convertToEntity(orderDTO);
//        order = orderRepository.save(order);
//        return convertToDTO(order);
//    }
//
//    public OrderDTO updateOrder(Long id, OrderDTO orderDTO){
//        Order order= orderRepository.findById(id).orElseThrow(() ->
//                new ResponseStatusException(HttpStatus.NOT_FOUND, "Order not found"));
//        order = convertToEntity(orderDTO);
//        orderRepository.save(order);
//        return convertToDTO(order);
//    }
//
//    public void deleteOrder(Long id){
//        Order order = orderRepository.findById(id).orElseThrow(() ->
//                new ResponseStatusException(HttpStatus.NOT_FOUND, "Order not found"));
//        orderRepository.delete(order);
//    }
//
//    public OrderDTO convertToDTO(Order order) {
//        OrderDTO orderDTO = new OrderDTO();
//        orderDTO.setId(order.getId());
//        orderDTO.setMoment(order.getMoment());
//        orderDTO.setStatus(order.getStatus());
//        orderDTO.setUser(convertToUserDTO(order.getUser(), order.getOrderItems()));
//        return orderDTO;
//    }
//
//    public Order convertToEntity(OrderDTO orderDTO) {
//        Order order = new Order();
//        order.setId(orderDTO.getId());
//        order.setMoment(orderDTO.getMoment());
//        order.setStatus(orderDTO.getStatus());
//        order.setUser(convertToUserEntity(orderDTO.getUser()));
//        order.setPayment(convertToPaymentEntity(orderDTO.getPayment()));
//        return order;
//    }
//}
