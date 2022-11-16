package backend.springproj.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
@Getter @Setter

public class Reservation {

    @Id
    @GeneratedValue
    private Long reservation_id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cafe_id")
    private Cafe cafe;

    private LocalDateTime reservationDate;

    private int peopleNum;

    @Enumerated(EnumType.STRING)
    private ReservationStatus reservationStatus;




}
