package stanislav.danylenko.examples.patterns.structural.proxy.impl;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.structural.proxy.SensitiveService;
import stanislav.danylenko.examples.patterns.structural.proxy.components.AuthUser;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class SensitiveServiceImpl implements SensitiveService {

    private static final List<String> RECORDS = new ArrayList<>();

    @Override
    public void create(AuthUser user, String record) {
        log.info("Access user: {}", user.name());
        RECORDS.add(record);
    }

    @Override
    public void delete(AuthUser user, String record) {
        log.info("Access user: {}", user.name());
        RECORDS.remove(record);
    }
}
