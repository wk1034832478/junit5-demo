package top.hyywk.extension;

import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.extension.ExtendWith;
import top.hyywk.TestInstance;
import top.hyywk.annotation.DisplayTest;

public class ExtensionTest {

    @DisplayTest
    @ExtendWith(TestInstanceParameterResolver.class)
    void test1(TestInstance testInstance, TestReporter reporter) {
        reporter.publishEntry( testInstance.getName() );
    }
}
