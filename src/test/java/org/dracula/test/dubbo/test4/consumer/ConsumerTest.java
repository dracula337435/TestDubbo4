package org.dracula.test.dubbo.test4.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.dracula.test.dubbo.test4.TestInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class ConsumerTest {

    @Reference
    TestInterface testInterface;

    @Test
    public void test(){
        System.out.println(testInterface.test());
    }

}
