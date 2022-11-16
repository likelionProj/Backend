package backend.springproj.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Embeddable
@Getter @Setter
public class Location {

    private Long id;
    // 학교 이름
    private String name;
    // 위도
    private int lat;
    // 경도
    private int lon;

    protected Location(){
    }

    public Location(Long id, String name, int lat, int lon){
        this.id = id;
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }

}
