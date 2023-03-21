package stanislav.danylenko.examples.patterns.creational.factory.simple;

import stanislav.danylenko.examples.patterns.creational.factory.simple.components.SimpleRepository;
import stanislav.danylenko.examples.patterns.creational.factory.simple.components.impl.SimpleRepositoryJdbcImpl;
import stanislav.danylenko.examples.patterns.creational.factory.simple.components.impl.SimpleRepositoryHibernateImpl;

public final class RepositoryFactory {

    private RepositoryFactory() {}

    public static SimpleRepository createRepository(String type) {
        if ("Jdbc".equals(type)) {
            return new SimpleRepositoryJdbcImpl(type);
        } else {
            return new SimpleRepositoryHibernateImpl(type);
        }
    }

}
