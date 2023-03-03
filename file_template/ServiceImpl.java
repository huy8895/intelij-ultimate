import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Slf4j
@Service
@RequiredArgsConstructor
public class ${NAME}ServiceImpl implements ${NAME}Service {
    private final ${NAME}Repository repository;
}
