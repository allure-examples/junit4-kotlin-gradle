package ru.yandex.qatools.allure.junit;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class AllureTestRunner extends BlockJUnit4ClassRunner {

    public AllureTestRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    public void run(RunNotifier notifier) {
        // JUnit don't support Java SPI for adding test listeners.
        // To add global Listener we should manually create JUnitCore.
        // With gradle we don't have (?) such option.
        // Solution - add listener via runner.
        // And manually call "runStarted" and "runFinished" events.
        notifier.addListener(new AllureRunListener());

        // Allure do nothing on testRunStarted
        // Just for consitency.
        notifier.fireTestRunStarted(Description.createSuiteDescription("Tests"));

        super.run(notifier);

        // Allure don't use Result from JUnit.
        // It gathers results on its own.
        // So, basically any param is OK here.
        notifier.fireTestRunFinished(new Result());
    }
}
