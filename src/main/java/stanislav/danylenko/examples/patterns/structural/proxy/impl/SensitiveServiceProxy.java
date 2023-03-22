package stanislav.danylenko.examples.patterns.structural.proxy.impl;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.structural.proxy.SensitiveService;
import stanislav.danylenko.examples.patterns.structural.proxy.components.AuthUser;
import stanislav.danylenko.examples.patterns.structural.proxy.components.Role;

@Slf4j
public class SensitiveServiceProxy implements SensitiveService {

    private final SensitiveService sensitiveService;

    public SensitiveServiceProxy(SensitiveService sensitiveService) {
        this.sensitiveService = sensitiveService;
    }

    public SensitiveServiceProxy() {
        this.sensitiveService = new SensitiveServiceImpl();
    }

    @Override
    public void create(AuthUser user, String record) {
        sensitiveService.create(user, record);
    }

    @Override
    public void delete(AuthUser user, String record) {
        if (user.role() == Role.ADMIN) {
            sensitiveService.delete(user, record);
        } else {
            log.info("Access denied dor user: {}", user.name());
        }
    }
}
