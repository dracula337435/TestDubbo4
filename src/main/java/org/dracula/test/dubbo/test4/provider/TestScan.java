package org.dracula.test.dubbo.test4.provider;

import org.dracula.test.dubbo.test4.TestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 作为试验，dubbo的@Service注解不需要@Component
 * {@link TestScan#testInterface}属性自动注入成功，
 * 注意{@link TestInterfaceImpl}上只有dubbo的@Service注解，没有@Component
 * @author dk
 */
@Component
public class TestScan {

    @Autowired
    TestInterface testInterface;

}
