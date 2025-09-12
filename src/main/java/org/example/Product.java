package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product
{
    private int id;
    private String name;
    private double price;
    private String description;
    private Category category; // Додано поле для зберігання категорії

    @Override
    public String toString()
    {
        return "Товар{" +
                "id=" + id +
                ", назва='" + name + '\'' +
                ", ціна=" + price +
                ", опис='" + description + '\'' +
                ", категорія='" + category.getName() + '\'' +
                '}';
    }

}
