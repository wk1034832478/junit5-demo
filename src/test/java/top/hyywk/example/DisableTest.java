package top.hyywk.example;


import org.junit.jupiter.api.Disabled;
import top.hyywk.annotation.DisplayTest;

/**
 * 执行测试类
 */
public class DisableTest {

    @DisplayTest
    void test1() {
        System.out.println("这段测试代码会执行的！");
    }

    @Disabled
    @DisplayTest
    void test2() {
        System.out.println("这段测试代码不会执行的！");
    }
}
