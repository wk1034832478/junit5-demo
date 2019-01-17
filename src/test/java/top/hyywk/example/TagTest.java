package top.hyywk.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * 一般和@Disabled注解一起使用，来过滤、测试、执行注解
 */
@Tag("fast")
@Tag("model")
public class TagTest {

    @Tag("fast")
    @Test
    void test1() {
        System.out.println("fast");
    }

    @Tag("tax")
    @Test
    void test2() {
        System.out.println("tax");
    }

    @Test
    @Tag("taxes")
    void test3() {
        System.out.println("taxes");
    }
}
