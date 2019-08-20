package micronaut.postconstruct;

import io.micronaut.context.ApplicationContext;
import org.junit.Test;
import static org.junit.Assert.*;

public class MicronautPostConstructTest {

    @Test
    public void withSingletonAnnotation() {
        ApplicationContext applicationContext = ApplicationContext.run();
        var withSingleton = applicationContext.getBean(WithSingleton.class);

        assertNotNull(withSingleton.field);
    }

    @Test
    public void withoutSingletonAnnotation() {
        ApplicationContext ac = ApplicationContext.run();
        var withoutSingleton = ac.getBean(WithoutSingleton.class);

        assertNotNull(withoutSingleton.field);
    }

}
