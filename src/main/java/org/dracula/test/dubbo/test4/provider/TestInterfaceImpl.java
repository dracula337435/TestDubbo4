package org.dracula.test.dubbo.test4.provider;

import org.apache.dubbo.config.annotation.Service;
import org.dracula.test.dubbo.test4.TestInterface;

/**
 * @author dk
 */
@Service
public class TestInterfaceImpl implements TestInterface {

    @Override
    public String test() {
        return "hello gxk";
    }

}
