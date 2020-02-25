package org.dracula.test.dubbo.test4.consumer;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.dracula.test.dubbo.test4.TestInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration
public class ConsumerTest {

    @Reference
    TestInterface testInterface;

    @Test
    public void test(){
        System.out.println(testInterface.test());
    }

    @Configuration
    @DubboComponentScan
    public static class Config {

        @Bean
        public ApplicationConfig applicationConfig(){
            ApplicationConfig applicationConfig = new ApplicationConfig();
            applicationConfig.setName("consumer-test");
            return applicationConfig;
        }

        @Bean
        public RegistryConfig registryConfig(){
            RegistryConfig registryConfig = new RegistryConfig();
            registryConfig.setAddress("multicast://224.5.6.7:1234");
            return registryConfig;
        }

    }

}
