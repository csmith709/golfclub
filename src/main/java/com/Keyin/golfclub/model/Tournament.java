package com.Keyin.golfclub.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private LocalDate startDate;
    private LocalDate endDate;
    private String location;
    private Double entryFee;
    private Double cashPrize;

    @ManyToMany
    @JoinTable(
            name = "tournament_members", // Join table name
            joinColumns = @JoinColumn(name = "tournament_id"), // Foreign key to Tournament
            inverseJoinColumns = @JoinColumn(name = "member_id") // Foreign key to Member
    )
    private List<Member> members = new ArrayList<>(); // Many-to-many relationship

    @Override
    public String toString() {
        return "Tournament{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", location='" + location + '\'' +
                ", entryFee=" + entryFee +
                ", cashPrize=" + cashPrize +
                '}';
    }
}
