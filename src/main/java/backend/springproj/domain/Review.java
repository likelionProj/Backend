package backend.springproj.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "reviews")
@Getter @Setter
@NoArgsConstructor
public class Review {

    @Id @GeneratedValue
    @Column(name = "review_id")
    private Long reviewId;

    private LocalDateTime reviewDate;

    private String reviewContent;

    @ManyToOne(fetch = LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private Member member;

}
