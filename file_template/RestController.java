// #parse("RestController.java") for include file
  
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
#set($api = $NAME.toLowerCase())

@Slf4j
@RestController
@RequestMapping("/api/${api}s")
@RequiredArgsConstructor
public class ${NAME}Controller {
    private final ${NAME}Service service;
}
