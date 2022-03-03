package jupiterextensions.extensions_as_data_provider;

import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testng.Assert;

public class TestJupiter3 {

    @TestTemplate
    @ExtendWith(PersonInvocationContextProvider.class)
    public void testPeople(Person person) {
        Assert.assertEquals(50, person.getAge());
    }
}
