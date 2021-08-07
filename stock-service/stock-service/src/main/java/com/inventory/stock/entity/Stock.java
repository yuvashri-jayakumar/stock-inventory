package com.inventory.stock.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int number;
    private String name;
    private BigDecimal price;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date purchaseDate;
    private Long quantity;

}
