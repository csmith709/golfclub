package repository;

import model.Member;
import model.Tournament;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;


public interface TournamentRepository extends JpaRepository<Tournament, Long> {
    List<Tournament> findByStartDate(LocalDate date);
    List<Tournament> findByLocation(String location);

    @Query("SELECT t.members FROM Tournament t WHERE t.id = :tournamentId")
    List<Member> findMembersInTournament(@Param("tournamentId") Long tournamentId);
}
