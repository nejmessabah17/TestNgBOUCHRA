package Class01;

import org.testng.annotations.Test;

public class dependsOn {
    @Test
    public void  Login(){
        System.out.println("i am here");
    }

    @Test(dependsOnMethods = {"Login"})
    public  void DashBoardverfification(){
        System.out.println("after login i am verifying dashboard");
    }
}
