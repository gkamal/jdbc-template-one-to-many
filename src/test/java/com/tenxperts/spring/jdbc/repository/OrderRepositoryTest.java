package com.tenxperts.spring.jdbc.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tenxperts.spring.jdbc.domain.Order;

@ContextConfiguration("classpath:META-INF/spring/app-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class OrderRepositoryTest {

    @Autowired
    private OrderRepository orderRepository;
    
    @Test
    public void findOrderWithItem() {
        Order order = orderRepository.findOrderWithItems(1l);
        assertNotNull(order);
        assertEquals("Kamal", order.getUser());
        assertEquals(3, order.getItems().size());
    }
    
    @Test
    public void findAllOrderWithItmes() {
        List<Order> orders = orderRepository.findAllOrderWithItmes();
        assertEquals(3, orders.size());
    }

}
