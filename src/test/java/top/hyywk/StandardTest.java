package top.hyywk;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * 标准测试类
 * 任何使用元注解@Test、@RepeatedTest、@ParameterizedTest、@ TestFactory或@TestTemplate标注的实例方法都是一个测试方法。任何包含至少一种测试方法的顶级类或静态成员类都是一个测试类。
 * 任何一个测试方法是
 * 一个标准的测试类
 */
public class StandardTest {
    @BeforeAll
    static void initAll() {
    }

    @BeforeEach
    void init() {
    }

    @Test
    void succeedingTest() {
    }

    @Test
    void failingTest() {
        // 可以将这句代码注释掉，防止最后测试的时候不通过
        fail("这个错误是故意抛出的！");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }
}
