package ru.yandex.qatools.allure.junit;

import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@Description("This is an example test suite")
public class ExampleTestSuite extends BaseTest {

    @Title("Failing test")
    @Test
    public void failingTest() {
        assertThat(1, equalTo(2));
    }

    @Title("Successful test")
    @Test
    public void successfulTest() {
        assertThat(2, equalTo(2));
    }
}
