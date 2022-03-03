package annotations;

import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CheckRole {

    @Test
    public void test() throws IllegalAccessException, NoSuchMethodException {
        Admin a = new Admin();
        a.getRole();
        Buyer b = new Buyer();
        b.getRole();

        Person p = new Person();

        getPermissions(b);
    }

    @Alert(role = Roles.BUYER)
    public <T extends Person> void getPermissions(T person) throws IllegalAccessException, NoSuchMethodException {
        checkRole(person);
        person.getPermissions();
    }


    public void checkRole(Object obj) throws IllegalAccessException, NoSuchMethodException {

        Roles value = null;

        try {
            Field f = null;
            f = obj.getClass().getDeclaredField("role");
            f.setAccessible(true);

            if (obj instanceof Admin) {
                Admin a = new Admin();
                value = (Roles) f.get(a);
            } else {
                Buyer b = new Buyer();
                value = (Roles) f.get(b);
            }

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        Method method = this.getClass().getDeclaredMethod("getPermissions", Person.class);
        Alert annotation = method.getDeclaredAnnotation(Alert.class);
        Roles alertAnnotationParameter = annotation.role();

        if (value.equals(alertAnnotationParameter)) {
            throw new IllegalAccessException(String.format("This user %s does not grant permissions", alertAnnotationParameter.toString()));
        }
    }
}
