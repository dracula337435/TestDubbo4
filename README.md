# 试验dubbo

## 主要目的

1. dubbo和spring-boot  
提供方+actuator，后来使用@DubboComponentScan，定义好@Configuration中的application和registry后消费方搞定

## 踩坑

1. yaml文件不行，properties文件可以。两文件可以共存。优先级，还没试  
试了试，dubbo.scan.basePackages不能放入yaml，其他几个（application, registry, protocol）可以放入yaml