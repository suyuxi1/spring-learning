
# 关于Spring的配置和注解说明

## 1.基于xml方式来做bean的配置

- <bean>标签的使用:id class
- 构造器注入:ref引用其他对象
- setter注入: p:简写形式

## 2.两种方式可以获取xml中的bean
- ApplicationContext获得上下文、ac.getBean(""), main方法使用

