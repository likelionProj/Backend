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
    @Column(name = "university_id")
    private Long id;

    String name;

    @Embedded
    private Location location;

    @OneToOne(mappedBy = "university", fetch = FetchType.LAZY)
    private Member member;
}
