package com.govind.apiproject1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Seller {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String gender;
    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "sp_fk",referencedColumnName = "id")
    private List<Product> products;

}
