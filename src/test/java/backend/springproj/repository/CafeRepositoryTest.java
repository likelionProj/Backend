package backend.springproj.repository;

import backend.springproj.domain.Cafe;
import backend.springproj.service.CafeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
    public void 회원가입() throws Exception {

        //Given
        Cafe cafe = new Cafe();
        cafe.setName("모모랜드");

        //When
        Long saveId = cafeService.join(cafe);

        //Then
        assertEquals(cafe, cafeRepository.findOne(saveId));
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