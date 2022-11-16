package backend.springproj.service;

import backend.springproj.domain.Cafe;
import backend.springproj.repository.CafeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CafeService {

    /*
     * 필드주입. => 위험할 수도 있음
     */
//    @Autowired
//    CafeRepository cafeRepository;

    /*
     * 생성자 주입. => 안전하게 객체 생성 가능. 생성자가 하나면 @Autowired 생략가능
     */
    private final CafeRepository cafeRepository;

    @Transactional // 변경
    public Long join(Cafe cafe){
        validateDuplicationCafe(cafe);
        cafeRepository.save(cafe);

        return cafe.getId();
    }

    /*
     * 중복 카페 체크: 이름 기준으로
     */
    private void validateDuplicationCafe(Cafe cafe) {
        List<Cafe> findCafes = cafeRepository.findByName(cafe.getName());

        if(!findCafes.isEmpty()){
            throw new IllegalStateException("이미 존재하는 카페입니다!");
        }
    }

    /*
     * 전체 카페 조회
     */
    public List<Cafe> findCafe(){
        return cafeRepository.findAll();
    }

    public Cafe findOne(Long cafeId){
        return cafeRepository.findOne(cafeId);
    }
}
