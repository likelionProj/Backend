package backend.springproj.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class University {

    @Id
    @GeneratedValue
    @Column(name = "univ_id")
    private Long id;

    String Name;

    @OneToOne(mappedBy = "University")
    private LocationId locationId;

    @OneToOne(mappedBy = "university", fetch = FetchType.LAZY)
    private Member member;
}
