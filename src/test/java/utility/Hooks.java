package utility;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {

    @Before
    public void setUp() {
        BrowserDriver.getDriver();
    }

    @After
    public void tearDown() {
        BrowserDriver.close();
    }
}
