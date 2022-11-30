package backend.springproj.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Location {

    @Id @GeneratedValue
    @Column(name = "location_id")
    private Long id;

    // 학교 이름
    private String name;

    // 위도
    private int lat;

    // 경도
    private int lon;

    @OneToOne(mappedBy = "location", fetch = FetchType.LAZY)
    private University university;

    @OneToOne(mappedBy = "cafeLocation", fetch = FetchType.LAZY)
    private Cafe cafe;
}