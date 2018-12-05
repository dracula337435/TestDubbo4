# 试验dubbo

## 主要目的

1. dubbo和spring-boot  
后来使用@DubboComponentScan，定义好@Configuration中的application和registry后消费方搞定
1. actuator
提供方+actuator，几个端点的名字及对应地址如下

|        端点名       |地址（省略/actuator前缀）|
|:------------------:|:--------------------:|
|        dubbo       |       /dubbo         |
|    dubbo-configs   |     /dubbo/configs   |
|  dubbo-properties  |   /dubbo/properties  |
|  dubbo-references  |      套路同上，略      |
|   dubbo-services   |      套路同上，略      |
|   dubbo-shutdown   |      套路同上，略      |
yml中开放端口的配置如下：
```
management:
  endpoints:
    web:
      exposure:
        include:
          - 'dubbo'
          - 'dubbo-configs'
          - 'dubbo-properties'
  endpoint:
    dubbo-shutdown:
      enabled: true
    dubbo-services:
      enabled: true
    dubbo-references:
      enabled: true
```

## 踩坑

1. yaml文件有些配置不生效，properties文件中暂未发现。两文件可以共存。优先级，还没试  
试了试，dubbo.scan.basePackages放入yaml无效，其他几个（application, registry, protocol）放入yaml有效

1. dubbo的@Service注解不需要@Component，见```TestInterfaceImpl```类，只有dubbo的@Service而没有@Component，
但是```TestScan```类中的TestInterface类型属性却可以成功注入