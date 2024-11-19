package com.Keyin.golfclub.controller;

import com.Keyin.golfclub.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Keyin.golfclub.repository.MemberRepository;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;

    // Adding a new member
    @PostMapping
    public Member createMember(@RequestBody Member member) {
        return memberRepository.save(member);
    }

    // Get all members
    @GetMapping
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    // Search for member by name
    @GetMapping("/search")
    public List<Member> searchMembers(@RequestParam String name) {
        return memberRepository.findByNameIgnoreCase(name);
    }
}
