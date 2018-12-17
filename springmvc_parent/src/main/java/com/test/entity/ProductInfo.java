package com.test.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
@ToString
public class ProductInfo {

    private String id;
    private String name;
    private Double price;
    private int stock;
    private String describe;
    private String icon;
    @DateTimeFormat(style = "yyyy-MM-dd")
    private Date createDate;
    private List<User> users;

}
