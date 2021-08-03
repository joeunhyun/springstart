package hello.hellospring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired //컨트롤러와 서비스를 연결
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

}
