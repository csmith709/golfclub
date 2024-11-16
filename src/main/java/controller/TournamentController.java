package controller;

import model.Member;
import model.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.TournamentService; // Use the service instead of the repository

import java.util.List;

@RestController
@RequestMapping("/api/tournaments")
public class TournamentController {

    @Autowired
    private TournamentService tournamentService; // Autowire service layer

    // Create a new tournament
    @PostMapping
    public Tournament createTournament(@RequestBody Tournament tournament) {
        return tournamentService.addTournament(tournament);  // Use service method
    }

    // Get all tournaments
    @GetMapping
    public List<Tournament> getAllTournaments() {
        return tournamentService.getAllTournaments();  // Use service method
    }

    // Add member to tournament
    @PostMapping("/{tournamentId}/members/{memberId}")
    public Tournament addMemberToTournament(@PathVariable Long tournamentId, @PathVariable Long memberId) {
        return tournamentService.addMemberToTournament(tournamentId, memberId); // Use service method
    }

    // Get all members in a tournament
    @GetMapping("/{tournamentId}/members")
    public List<Member> getMembersInTournament(@PathVariable Long tournamentId) {
        return tournamentService.getMembersInTournament(tournamentId); // Use service method
    }
}
