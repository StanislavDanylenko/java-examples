package stanislav.danylenko.examples.patterns.structural.proxy.impl;

import java.util.List;

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
    public void create(AuthUser user, String value) {
        sensitiveService.create(user, value);
    }

    @Override
    public void delete(AuthUser user, String value) {
        if (user.role() == Role.ADMIN) {
            sensitiveService.delete(user, value);
        } else {
            log.info("Access denied dor user: {}", user.name());
        }
    }

    @Override
    public List<String> read(AuthUser user) {
        return sensitiveService.read(user);
    }
}
