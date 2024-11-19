package com.Keyin.golfclub.service;

import com.Keyin.golfclub.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Keyin.golfclub.repository.MemberRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

//    add new member
    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

//    get all members
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    // Get member by ID
    public Optional<Member> getMemberById(Long id) {
        return memberRepository.findById(id);
    }

//    find member by phoneNumber
    public List<Member> getMemberByPhoneNumber(String phoneNumber) {
        return memberRepository.findByPhoneNumber(phoneNumber);
    }

//    find by name
    public List<Member> searchMemberByName(String name) {
        return memberRepository.findByNameIgnoreCase(name);
    }

    //    find by start startDate
    public List<Member> searchMemberByStartDate(LocalDate startDate) {
        return memberRepository.findMemberStartDate(startDate);
    }

//    find by membership type
    public List<Member> searchByMembershipType(String membershipType) {
        return memberRepository.findByMembershipType(membershipType);
    }

//    Delete member by ID
    public void deleteMember(Long Id) {
        memberRepository.deleteById(Id);
    }
}
