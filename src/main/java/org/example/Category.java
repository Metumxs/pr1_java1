package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Category
{
    private int id; // Унікальний ідентифікатор категорії
    private String name; // Назва категорії

    @Override
    public String toString()
    {
        return "Категорія{" +
                "id=" + id +
                ", назва='" + name + '\'' +
                '}';
    }
}