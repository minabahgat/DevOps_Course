@RestController
public class JhooqDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Docker Demo - Hello Jhooq";
    }
}
