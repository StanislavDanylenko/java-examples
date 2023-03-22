package stanislav.danylenko.examples;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.structural.facade.serialization.SerializationFacade;
import stanislav.danylenko.examples.patterns.structural.facade.serialization.components.JsonDeserializer;
import stanislav.danylenko.examples.patterns.structural.facade.serialization.components.ToXmlSerializer;
import stanislav.danylenko.examples.patterns.structural.proxy.SensitiveService;
import stanislav.danylenko.examples.patterns.structural.proxy.components.AuthUser;
import stanislav.danylenko.examples.patterns.structural.proxy.components.Role;
import stanislav.danylenko.examples.patterns.structural.proxy.impl.SensitiveServiceImpl;
import stanislav.danylenko.examples.patterns.structural.proxy.impl.SensitiveServiceProxy;

@Slf4j
public class Main {

    public static void main(String[] args) {
        AuthUser user = new AuthUser("user", Role.USER);
        AuthUser admin = new AuthUser("admin", Role.ADMIN);

        String userMessage = "aaa";
        String adminMessage = "bbb";

        SensitiveService sensitiveService = new SensitiveServiceProxy();
        sensitiveService.create(user, userMessage);
        sensitiveService.create(admin, adminMessage);
        sensitiveService.delete(user, userMessage);
        sensitiveService.delete(admin, adminMessage);

        log.info("end");
    }

}
