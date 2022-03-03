package dataprovider;

import org.testng.annotations.DataProvider;

public class Test {

    private Object[][] data() {
        System.out.println("inside");
        return new Object[][] {{"a"}, {"b"}};
    }

    @DataProvider(name = "my")
    public Object[][] provider() {
        return data();
    }

    @org.testng.annotations.Test(dataProvider = "my")
    public void test(String text) {
        System.out.println(text);

    }
}
