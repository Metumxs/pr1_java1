package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Order
{
    private List<Product> products; // Список товарів у замовленні
    private double totalPrice; // Загальна вартість замовлення
    private String status; // Статус замовлення

    // Конструктор
    public Order(Cart cart)
    {
        this.products = cart.getProducts(); // Копіювання товарів з кошика в список товарів замовлення
        this.totalPrice = cart.getTotalPrice();
        this.status = "Нове"; // Стандартний статус при створенні замовлення
    }

    // Метод для виведення інформації про замовлення
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("Замовлення:\n");
        for (Product product : products)
        {
            sb.append(product.toString()).append("\n");
        }
        sb.append("Загальна вартість: ").append(totalPrice).append("\n");
        sb.append("Статус: ").append(status);
        return sb.toString();
    }
}
