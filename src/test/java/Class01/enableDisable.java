package Class01;

import org.testng.annotations.Test;

public class enableDisable {
    @Test(enabled = false)
    public void aTest() {
        System.out.println("i am the first test case");
    }

    @Test
    public void bTest() {
        System.out.println("i am the second test case");
    }

    @Test(enabled = false)
    public void cTest() {
        System.out.println("i am the third test case");
    }
}