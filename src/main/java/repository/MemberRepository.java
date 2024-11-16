package repository;

import model.Member;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByNameIgnoreCase(String name);
    List<Member> findByMembershipType(String membershipType);
    List<Member> findByPhoneNumber(String phoneNumber);

    @Query("SELECT m FROM Member m JOIN m.tournaments t WHERE t.startDate = :startDate")
    List<Member> findMemberStartDate(@Param("startDate") LocalDate startDate);
}
