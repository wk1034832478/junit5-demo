package top.hyywk.hamcrest;

import top.hyywk.annotation.DisplayTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * 使用的是hamcrest断言库，关于hamcrest断言库的具体使用需要参考官方文档！
 */
public class HamcrestAssertionDemo {
    @DisplayTest
    public void test() {
        assertThat(2 + 1, is(equalTo(3)));
    }
}
