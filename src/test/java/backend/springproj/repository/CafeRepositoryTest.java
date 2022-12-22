package backend.springproj.repository;

import backend.springproj.domain.Cafe;
import backend.springproj.domain.Location;
import backend.springproj.service.CafeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.assertj.core.api.Fail.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Transactional
public class CafeRepositoryTest {

    @Autowired
    CafeService cafeService;
    @Autowired
    CafeRepository cafeRepository;

    @Test
    public void 카페등록() throws Exception {

        //Given
        Cafe cafe = new Cafe();
        cafe.setName("모모랜드");
        cafe.setLocation(new Location("햔양대", 1, 1));

        //When
        Long saveId = cafeService.join(cafe);


        //Then
        assertEquals(cafe, cafeRepository.findOne(saveId));

        Cafe cafe1 = new Cafe();
        cafe.setName("프로스콘스");
        cafe.setLocation(new Location("햔양대", 1, 1));

        Long saveId1 = cafeService.join(cafe1);

        Cafe cafe2 = new Cafe();
        cafe.setName("시저커피");
        cafe.setLocation(new Location("햔양대", 1, 1));

        Long saveId2 = cafeService.join(cafe2);
    }

//    @Test(expected = IllegalStateException.class)
//    public void 중복_회원_예외() throws Exception {
//        //given
//        Member member1 = new Member();
//        member1.setName("Kim");
//
//        Member member2 = new Member();
//        member2.setName("Kim");
//
//        //when
//        memberService.join(member1);
//        memberService.join(member2);
//
//        //then
//        fail("예외가 발생해야 한다.");
//    }
}