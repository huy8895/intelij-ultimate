// #parse("RestController.java") for include file
  
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
