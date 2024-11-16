package service;

import model.Member;
import model.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.MemberRepository;
import repository.TournamentRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TournamentService {

    @Autowired
    private TournamentRepository tournamentRepository;

    @Autowired
    private MemberRepository memberRepository;

    // Add new tournament
    public Tournament addTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    // Get all tournaments
    public List<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }

    // Find tournaments by ID
    public Optional<Tournament> getTournamentById(Long Id) {
        return tournamentRepository.findById(Id);
    }

    // Find tournaments by start date
    public List<Tournament> searchTournamentByStartDate(LocalDate startDate) {
        return tournamentRepository.findByStartDate(startDate);
    }

    // Find tournament by location
    public List<Tournament> searchTournamentByLocation(String location) {
        return tournamentRepository.findByLocation(location);
    }

    // Add member to a tournament
    public Tournament addMemberToTournament(Long tournamentId, Long memberId) {
        Optional<Tournament> tournamentOpt = tournamentRepository.findById(tournamentId);
        Optional<Member> memberOpt = memberRepository.findById(memberId);

        if (tournamentOpt.isPresent() && memberOpt.isPresent()) {
            Tournament tournament = tournamentOpt.get();
            Member member = memberOpt.get();

            tournament.getMembers().add(member);
            return tournamentRepository.save(tournament);
        } else {
            throw new RuntimeException("Tournament or Member not found");
        }
    }

    // Get members in a tournament
    public List<Member> getMembersInTournament(Long tournamentId) {
        return tournamentRepository.findMembersInTournament(tournamentId);
    }
}
