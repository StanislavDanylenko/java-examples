package stanislav.danylenko.examples.patterns.structural.proxy.impl;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.structural.proxy.SensitiveService;
import stanislav.danylenko.examples.patterns.structural.proxy.components.AuthUser;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class SensitiveServiceImpl implements SensitiveService {

    private static final List<String> VALUES = new ArrayList<>();

    @Override
    public void create(AuthUser user, String value) {
        log.info("Access user: {}", user.name());
        VALUES.add(value);
    }

    @Override
    public void delete(AuthUser user, String value) {
        log.info("Access user: {}", user.name());
        VALUES.remove(value);
    }

    @Override
    public List<String> read(AuthUser user) {
        log.info("Access user: {}", user.name());
        return List.copyOf(VALUES);
    }

}
