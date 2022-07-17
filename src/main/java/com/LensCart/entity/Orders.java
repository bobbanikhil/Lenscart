package com.LensCart.entity;

import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;





}
