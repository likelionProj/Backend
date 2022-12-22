package backend.springproj.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Embeddable
@Getter
public class Location {

    // 위도
    private double lat;

    // 경도
    private double lon;

    protected Location() {

    }

    public Location(String name, double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

}
