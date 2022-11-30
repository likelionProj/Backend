package backend.springproj.domain;

import backend.springproj.repository.CafeRepository;
import backend.springproj.service.CafeService;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CafeTest {
    @Autowired
    CafeService cafeService;

    @Autowired
    CafeRepository cafeRepository;

    @Test
//    @Transactional
//    @Rollback
    public void 카페등록() throws Exception{
        // given
        Cafe cafe = new Cafe();
        cafe.setName("모모랜드");

        //when
        Long saveId = cafeService.join(cafe);
        Cafe findCafe = cafeRepository.findOne(saveId);

        //then
        Assertions.assertThat(findCafe.getId()).isEqualTo(cafe.getId());
    }

}