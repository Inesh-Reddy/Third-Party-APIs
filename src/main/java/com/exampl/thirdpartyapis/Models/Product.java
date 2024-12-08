package com.exampl.thirdpartyapis.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long   id;
    private String title;
    private Long   price;
    private String description;
    private String imageUrl;
    private String Category;


    public Product() {}

    public Product(Long id, String title, Long price, String description, String imageUrl, String Category) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
        this.Category = Category;
    }

}
