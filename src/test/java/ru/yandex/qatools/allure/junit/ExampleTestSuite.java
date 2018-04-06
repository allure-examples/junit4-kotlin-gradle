package ru.yandex.qatools.allure.junit;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExampleTestSuite {

    @Test
    @DisplayName("Failing test")
    @Description("This is an example test suite")
    public void failingTest() {
        assertThat(1, equalTo(2));
    }

    @Test
    @DisplayName("Successful test")
    public void successfulTest() {
        firstStep();
    }

    @Step
    private void firstStep() {
        secondStep();
    }

    @Step
    private void secondStep() {

    }
}
