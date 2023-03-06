import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

#set($api = $NAME.toLowerCase())

@Slf4j
@RestController
@RequestMapping("/api/${api}s")
public class ${NAME}Controller extends AbstractBaseCRUDController<${NAME}, ${NAME}Service> {
    protected ${NAME}Controller(${NAME}Service service) {
        super(service, ${NAME}.class);
    }
}

public interface ${NAME}Service extends BaseCRUDService<${NAME}> {
}

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ${NAME}ServiceImpl extends AbstractBaseCRUDService<${NAME}, ${NAME}Repository> implements ${NAME}Service {
    protected ${NAME}ServiceImpl(${NAME}Repository repository) {
        super(repository);
    }
}

public interface ${NAME}Repository extends BaseCRUDRepository<${NAME}, Long> {
}
