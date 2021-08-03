package hello.hellospring.controller;


import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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



}
