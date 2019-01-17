package top.hyywk.example;

import org.junit.jupiter.api.*;
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

    /**
     * 使用junit5假设（Assumption）,用途，当满足条件的时候，执行一段代码，否则不执行并测试 失败
     */
    @DisplayTest
    void test3() {
        /**
         * 获取环境变量
         */
        String env = System.getenv("ENV");
        System.out.println( "环境变量：" + env);
        Assumptions.assumingThat( null == System.getenv("ENV"), () -> {
            System.out.println( "男模打表达式" );
        });
    }
}
