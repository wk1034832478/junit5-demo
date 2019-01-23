package top.hyywk.example;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import top.hyywk.annotation.DisplayTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Stream;

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

    /**
     * 重复测试
     * @param reporter 报告者
     */
    @RepeatedTest(value = 5, name = "repetition {currentRepetition} of {totalRepetitions}")
    void test4(TestReporter reporter, RepetitionInfo repetitionInfo) {
        reporter.publishEntry("输出");
        reporter.publishEntry( "当前重复次数" + repetitionInfo.getCurrentRepetition() );
    }


    /**
     * 参数化测试， 参数化设置需要加入新的依赖，仓库坐标如下：
     *<dependency>
     *       <groupId>org.junit.jupiter</groupId>
     *       <artifactId>junit-jupiter-params</artifactId>
     *       <version>${junit.jupiter.version}</version>
     *       <scope>test</scope>
     *</dependency>
     * 参数化测试具有多种数据源
     * Junit Jupiter提供一些开箱即用的源 注解。
     * 接下来每个子章节将提供一个简要的概述和一个示例。更多信息请参阅 org.junit.jupiter.params.provider 包中的JavaDoc。
     * @param string
     */
    @ParameterizedTest
    @ValueSource( strings = { "A", "B"} )
    void test5(String string) { // 消费参数源
        System.out.println( string );
        Assertions.assertTrue( true, "ok");
    }

    /**
     * 参数化测试，使用工厂函数提供参数数据源
     */
    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    void test6(List<String> strs1, List<String> strs2) {
        System.out.println(strs1);
        System.out.println(strs2);
    }

    /**
     * 为测试提供数据源
     * @return 参数流（Stream）
     */
    static Stream<Arguments> stringIntAndListProvider() {
        return Stream.of(
                Arguments.of(Arrays.asList("aaa", "b"), Arrays.asList("a", "b")),
                Arguments.of(Arrays.asList("aaaa", "b"), Arrays.asList("x", "y"))
        );
    }

}
