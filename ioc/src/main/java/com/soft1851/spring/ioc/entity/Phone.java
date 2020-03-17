package com.soft1851.spring.ioc.entity;

/**
 * @author su
 * @className Phone
 * @Description TODO
 * @Date 2020/3/12 11:13
 * @Version 1.0
 **/
public class Phone {
    private String brand;
    private String price;

    public Phone(String brand, String price) {
        this.brand = brand;
        this.price = price;
    }

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

}
