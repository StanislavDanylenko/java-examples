package stanislav.danylenko.examples.patterns.structural.proxy;

import stanislav.danylenko.examples.patterns.structural.proxy.components.AuthUser;

public interface SensitiveService {

    void create(AuthUser user, String record);
    void delete(AuthUser user, String record);

}
