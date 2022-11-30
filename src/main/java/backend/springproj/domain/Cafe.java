package backend.springproj.domain;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.Resource;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Cafe {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cafe_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "location_id")
    private Location cafeLocation;

<<<<<<< HEAD
=======
    // embedded type
//    @Embedded
//    private Location location;

    @OneToOne
    @JoinColumn(name = "location_id")
    private Location cafeLocation;
    //    private MoodStatus moodStatuses;
    // https://prohannah.tistory.com/133
    // 임베디드 타입을 바꿔야할거같기도하
//    private ArrayList<MoodStatus> moodStatus;
//    @ElementCollection
//    private List<String> moodStatus = new ArrayList<>();


>>>>>>> c9afede (66l)
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
//    @Resource(name = "reservations")
    private Reservation reservation;
}
