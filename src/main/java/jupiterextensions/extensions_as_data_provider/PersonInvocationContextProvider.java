package jupiterextensions.extensions_as_data_provider;

import org.junit.jupiter.api.extension.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class PersonInvocationContextProvider implements TestTemplateInvocationContextProvider {

    static List<Person> people = Arrays.asList(
            new Person("Alex", 30),
            new Person("Kate", 19),
            new Person("Sasha", 70));

    static List<TestTemplateInvocationContext> incCont = new ArrayList<>();

    static {
        people.forEach((x) -> incCont.add(invocationContext(x)));
    }


    @Override
    public boolean supportsTestTemplate(ExtensionContext extensionContext) {
        return true;
    }

    @Override
    public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext extensionContext) {
        return incCont.stream();
    }


    private static TestTemplateInvocationContext invocationContext(Person person) {
        return new TestTemplateInvocationContext() {
            @Override
            public String getDisplayName(int invocationIndex) {
                return person.getName();
            }

            @Override
            public List<Extension> getAdditionalExtensions() {
                return Collections.singletonList(new ParameterResolver() {
                    @Override
                    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
                        return parameterContext.getParameter().getType().equals(Person.class);
                    }

                    @Override
                    public Person resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
                        return person;
                    }
                });
            }
        };
    }
}
