package top.hyywk.interfaces;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;
import top.hyywk.annotation.DisplayTest;

/**
 * 使用无效，可能是因为intellij Idea暂时无法支持
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface TestInterface {


    @BeforeAll
    default void beforeAllTests(TestReporter testReporter) {
        testReporter.publishEntry( "BeforeAll" );
    }

    @Test
    static void test(TestReporter testReporter) {
        testReporter.publishEntry( "接口" );
    }

    /**
     * 测试接口当中的默认方法
     */
    @Test
    default void test1(TestReporter testReporter) {
        testReporter.publishEntry( "接口" );
    }
}
