package com.Keyin.golfclub;

import com.Keyin.golfclub.model.Member;
import com.Keyin.golfclub.model.Tournament;
import com.Keyin.golfclub.repository.MemberRepository;
import com.Keyin.golfclub.repository.TournamentRepository;
import com.Keyin.golfclub.service.TournamentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

import java.util.Optional;

public class TournamentServiceTest {

    @Mock
    private TournamentRepository tournamentRepository;

    @Mock
    private MemberRepository memberRepository;

    @InjectMocks
    private TournamentService tournamentService;

    private Tournament tournament;
    private Member member;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        tournament = new Tournament();
        tournament.setId(1L);
        tournament.setLocation("Golf Course");
        member = new Member();
        member.setId(1L);
        member.setName("John Doe");
    }

    @Test
    public void testAddMemberToTournament() {
        when(tournamentRepository.findById(1L)).thenReturn(Optional.of(tournament));
        when(memberRepository.findById(1L)).thenReturn(Optional.of(member));

        tournamentService.addMemberToTournament(1L, 1L);

        verify(tournamentRepository, times(1)).save(tournament);
    }
}
