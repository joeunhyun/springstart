package hello.hellospring.controller;


import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired //컨트롤러와 서비스를 연결
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }// 생성자 주입 - ***********주로 사용

    /*@Autowired private final MemberService memberService;;
    //필드 주입

    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }//setter 주입
    */
    @GetMapping("/members/new")
    public String createForm(){
        return "members/CreateMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form){
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }

}
