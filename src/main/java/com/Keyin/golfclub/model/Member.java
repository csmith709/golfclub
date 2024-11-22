package com.Keyin.golfclub.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String membershipType;
    private LocalDate startDate;
    private int durationInMonths;

    @ManyToMany(mappedBy = "members")
    private List<Tournament> tournaments = new ArrayList<>();

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", membershipType='" + membershipType + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
