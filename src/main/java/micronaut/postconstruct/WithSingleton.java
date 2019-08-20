package micronaut.postconstruct;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class WithSingleton {
    Object field;

    @Inject
    public WithSingleton() {
    }

    @PostConstruct
    public void postConstruct() {
        field = new Object();
    }
}
