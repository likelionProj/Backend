package backend.springproj.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//@Embeddable
@Entity
@Getter @Setter
public class Location {

    @Id
    @GeneratedValue
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
    protected Location(){
    }

    @OneToOne(mappedBy = "cafeLocation", fetch = FetchType.LAZY)
    private Cafe cafe;

    public Location(Long id, String name, int lat, int lon) {

        this.id = id;
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }

}
