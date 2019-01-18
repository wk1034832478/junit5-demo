package top.hyywk.example;

import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import top.hyywk.annotation.DisplayTest;

public class MyTestInfo {

    /**
     * 构造参数注入
     * @param testInfo
     */
    MyTestInfo(TestInfo testInfo) {
        System.out.println("构造参数------测试名称：" + testInfo.getDisplayName());
    }

    /**
     * 测试方法传入注入
     * @param testInfo
     */
    @DisplayTest
    void test1(TestInfo testInfo, TestReporter testReporter) {
        System.out.println("测试名称：" + testInfo.getDisplayName());
        testReporter.publishEntry("test reporter!");
    }
}
