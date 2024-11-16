package controller;

import model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.MemberRepository;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;

//    adding a new member
    @PostMapping
    public Member createMember(@RequestBody Member member) {
        return memberRepository.save(member);
    }

//    get all members
    @GetMapping
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

//    search for member by name
    @GetMapping("/search")
    public List<Member> searchMembers(@RequestParam  String name) {
        return memberRepository.findByNameIgnoreCase(name);
    }

}
