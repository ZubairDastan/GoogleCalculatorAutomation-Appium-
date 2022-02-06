import org.junit.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestRunner  {
    public TestCase testCase;

    @Test
    public void runTest() throws IOException {
        AppLaunch appLaunch = new AppLaunch();
        testCase = new TestCase(appLaunch.setup());
        String result = testCase.openApp();
        Assert.assertEquals(result, "12");
    }
}
