package dubbo.out.food.service.worker;


import org.springframework.stereotype.Service;

import dubbo.out.food.service.TestService;

/**
 * @author zhangph
 * @version 2017-07-10 14:15
 **/
public class TestServiceImpl implements TestService {

    public int test(int a, int b) {
        int result = a+b;
        return result;
    }
}
