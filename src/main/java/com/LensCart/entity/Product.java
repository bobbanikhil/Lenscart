package com.LensCart.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer productId;
    private String productName;
    private String prize;

    @ManyToOne
    private Category category;

    @ManyToMany(mappedBy = "products")
    private List<Orders> orders;


}
