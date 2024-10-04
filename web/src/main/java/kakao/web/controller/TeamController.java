package kakao.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TeamController {

    @GetMapping("/")
    public String redirectHome() {
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/team")
    public String team() {
        return "/team/team";
    }

    @GetMapping("/team/intro")
    public String intro() {
        return "/team/intro";
    }

    @GetMapping("/team/goal")
    public String goal() {
        return "/team/goal";
    }

    @GetMapping("/team/promise")
    public String promise() {
        return "/team/promise";
    }

    @GetMapping("/members")
    public String members() {
        return "/member/members";
    }

    @GetMapping("/members/member/{id}")
    public String member(@PathVariable("id") int index) {
        return "/member/member" + index;
    }

    @GetMapping("/future")
    public String futures() {
        return "/future/future";
    }

    @GetMapping("/future/{id}")
    public String future(@PathVariable("id") int index) {
        return "/future/future" + index;
    }
}
