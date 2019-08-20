package micronaut.postconstruct;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

public class WithoutSingleton {
    Object field;

    @Inject
    public WithoutSingleton() {
    }

    @PostConstruct
    public void postConstruct() {
        field = new Object();
    }
}
