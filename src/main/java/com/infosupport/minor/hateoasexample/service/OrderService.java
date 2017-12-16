package com.infosupport.minor.hateoasexample.service;

import com.infosupport.minor.hateoasexample.domain.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrdersForCustomer(String customerId);

    Order getOrderByIdForCustomer(String customerId, String orderId);
}