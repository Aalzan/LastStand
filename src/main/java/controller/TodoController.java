package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class TodoController {
    @GetMapping("/")
    public String homePage() {
        return "index"; // index.html будет найден в src/main/resources/templates
    }
}
