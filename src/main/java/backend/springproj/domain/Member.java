package backend.springproj.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long member_id;

    private String password;

    @OneToOne(fetch = LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "univ_id")
    private University university;

    private Grade grade;

    @OneToMany(fetch = LAZY, cascade = CascadeType.ALL)
    private List<Cafe> history = new ArrayList<>();

    @OneToMany(fetch = LAZY, cascade = CascadeType.ALL)
    private List<Cafe> favorite = new ArrayList<>();

    @OneToMany(fetch = LAZY, cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();

    @OneToMany(fetch = LAZY, cascade = CascadeType.ALL)
    private List<Reservation> reservations = new ArrayList<>();


}
