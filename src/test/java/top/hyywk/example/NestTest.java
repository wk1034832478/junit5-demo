package top.hyywk.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.extension.ParameterResolver;
import top.hyywk.annotation.DisplayTest;

/**
 * 嵌套类的测试
 * @Nested测试类必须是非静态嵌套类（即内部类），并且可以有任意多层的嵌套。这些内部类被认为是测试类家族的正式成员，
 * 但有一个例外：@BeforeAll和@AfterAll方法默认 不会工作。原因是Java不允许内部类中存在static成员。不过这种限制
 * 可以使用@TestInstance(Lifecycle.PER_CLASS)标注@Nested测试类来绕开（请参阅 测试实例生命周期）
 */
public class NestTest {

    @DisplayTest
    void test1() {
        System.out.println("test1");
    }

    @Nested
    class MyNest {
        @BeforeEach
        void before() {
            System.out.println("mynest before");
        }

        @DisplayTest
        void test1() {
            System.out.println("mynest test1");
        }
    }
}
