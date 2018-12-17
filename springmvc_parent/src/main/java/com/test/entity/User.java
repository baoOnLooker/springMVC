package com.test.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class User {

    private int id;
    private String name;
    private String phone;
    private List<ProductInfo> productInfos;

}
