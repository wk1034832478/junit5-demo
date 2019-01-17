package top.hyywk.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import top.hyywk.annotation.DisplayTest;

public class Example1 {
    /**
     * 当前版本的junit不需要将测试方法定义为public
     * 通过 @DisplayName 注解来测试方法进行命名
     */
    @DisplayName("测试方法1")
    @Test
    void test1() {
        /**
         * 断言类库均来自  org.junit.jupiter.api.Assertions静态类
         */
        Assertions.assertEquals(1,1,"测试未通过！");
    }

    @DisplayTest
    void test2() {
        Assertions.assertTrue(true,"测试未通过！");
    }
}
