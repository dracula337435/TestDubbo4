package org.dracula.test.dubbo.test4.provider;

import com.alibaba.dubbo.config.annotation.Service;
import org.dracula.test.dubbo.test4.TestInterface;
import org.springframework.stereotype.Component;

/**
 * @author dk
 */
@Service
@Component
public class TestInterfaceImpl implements TestInterface {

    @Override
    public String test() {
        return "hello gxk";
    }

}
