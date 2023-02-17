package com.zyb.admin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * @ClassName Junit5Test
 * @Description TODO
 * @Author ZYB
 * @Date 2023/2/14 20:47
 * @Version 1.0
 **/
@DisplayName("junit5测试类")
public class Junit5Test {
    @DisplayName("测试简单断言")
    @Test
    void testSimpleAssertions(){
        int cal = cal(3, 2);
        assertEquals(5,cal,"业务逻辑计算失败");
        assertSame(new Object(),new Object());
    }
    int cal(int i,int j){
        return i+j;
    }

}
