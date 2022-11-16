package backend.springproj.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class LocationId {

    @Id @GeneratedValue
    private Long id;

    // 학교 이름
    private String name;

    // 위도
    private int lat;

    // 경도
    private int lon;
}
