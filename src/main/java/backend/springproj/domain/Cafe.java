package backend.springproj.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Cafe {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cafe_id")
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "location_id")
    private Location cafeLocation;

    @Enumerated(EnumType.STRING)
    private MoodStatus moodStatus;

    private int noise;

    private String tableShape;

    private Boolean chair;

    private Boolean socket;

    private LocalDateTime openTime;

    private String Photo;

    private Boolean toilet;

    private Boolean studyCafe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToOne(mappedBy = "cafe", fetch = FetchType.LAZY)
    private Reservation reservation;
}
