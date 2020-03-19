package com.soft1851.spring.ioc.config;

import com.soft1851.spring.ioc.entity.Phone;
import com.soft1851.spring.ioc.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

/**
 * @author su
 * @className StudentConfig
 * @Description TODO
 * @Date 2020/3/19 14:22
 * @Version 1.0
 **/

@Configuration
@ComponentScan("com.soft1851.spring.ioc")
public class StudentConfig {

    @Bean
    public List<Phone> list(){
        List<Phone> phoneList = new ArrayList<>();
        Phone phone = new Phone();
        phone.setBrand("iphone11");
        phone.setPrice("8888");
        Phone phone1 = new Phone();
        phone1.setBrand("iphoneX");
        phone1.setPrice("6666");
        Collections.addAll(phoneList,phone);
        Collections.addAll(phoneList,phone1);
        return phoneList;
    }

    @Bean
    public Phone phone(){
        return new Phone("123","123");
    }



    @Bean
    public Set<String> computers(){
        Set<String> computers = new HashSet<>();
        computers.add("Dell");
        computers.add("Mac");
        computers.add("hp");
        return computers;
    }

    @Bean
    public Map<String,String> cars() {
        Map<String, String> cars = new HashMap<>();
        cars.put("1","奔驰");
        cars.put("2","宝马");
        cars.put("3","柯尼塞格");
        return cars;
    }
    @Bean
    public Student student() {
        Student student = new Student();
        student.setId(1002);
        student.setName("张");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("爬山");
        hobbies.add("洗衣服");
        hobbies.add("STUDY");
        student.setHobbies(hobbies);
//        Phone phone = new Phone();
//        phone.setBrand("iphone11");
//        phone.setPrice("8888");
//        Phone phone1 = new Phone();
//        phone1.setBrand("iphoneX");
//        phone1.setPrice("6666");
//        List<Phone> phones = new ArrayList<>();
//        phones.add(phone);
//        phones.add(phone1);
        student.setPhones(list());
        student.setComputer(computers());
        student.setCar(cars());
        return student;
    }

}
