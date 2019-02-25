package org.dracula.test.dubbo.test4.provider;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;

/**
 * @author dk
 */
@Component
public class MyPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

    private static Logger logger = LoggerFactory.getLogger(MyPostProcessor.class);

    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        logger.info("MyPostProcessor.predictBeanType"+" beanClass = [" + beanClass + "], beanName = [" + beanName + "]");
        return null;
    }

    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        logger.info("MyPostProcessor.determineCandidateConstructors"+" beanClass = [" + beanClass + "], beanName = [" + beanName + "]");
        return null;
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        logger.info("MyPostProcessor.getEarlyBeanReference");
        return bean;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        logger.info("MyPostProcessor.postProcessBeforeInstantiation"+" beanClass = [" + beanClass + "], beanName = [" + beanName + "]");
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        logger.info("MyPostProcessor.postProcessAfterInstantiation"+" bean = [" + bean + "], beanName = [" + beanName + "]");
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        logger.info("MyPostProcessor.postProcessPropertyValues"+" pvs = [" + pvs + "], pds = [" + pds + "], bean = [" + bean + "], beanName = [" + beanName + "]");
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        logger.info("MyPostProcessor.postProcessBeforeInitialization"+" bean = [" + bean + "], beanName = [" + beanName + "]");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("MyPostProcessor.postProcessAfterInitialization"+" bean = [" + bean + "], beanName = [" + beanName + "]");
        return bean;
    }
}