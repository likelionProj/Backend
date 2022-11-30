package backend.springproj.service;

import backend.springproj.domain.University;
import backend.springproj.repository.UniversityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UniversityService {
    /*
     * 필드 인젝션
     */
    private final UniversityRepository universityRepository;

    /*
     * 대학교 등록
     */
    @Transactional
    public Long join(University univ){
        // 중복 대학 검증
        validateDuplicateUniv(univ);

        // 레퍼지토리에 저장
        universityRepository.save(univ);
        return univ.getId();
    }

    private void validateDuplicateUniv(University univ) {
        // 동시에 해당 메소드에 들어오는 경우도 생각해야함.(멀티 쓰레드와 같은 경우)
        List<University> findUniv = universityRepository.findByName(univ.getName());
        if(!findUniv.isEmpty()){
            throw new IllegalStateException("이미 존재하는 대학입니다.");
        }
    }

    // 회원 전체 조회
    public List<University> findMembers(){
        return universityRepository.findAll();
    }

    // 회원 한명 조회
    public University findOne(Long univId){
        return universityRepository.findOne(univId);
    }
}
