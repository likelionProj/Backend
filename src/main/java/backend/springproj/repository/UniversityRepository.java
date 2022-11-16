package backend.springproj.repository;

import backend.springproj.domain.University;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UniversityRepository {

    // lombok을 이용한 주입
    private final EntityManager em;

    // JPA가 자동적으로 저장
    public void save(University univ){
        em.persist(univ);
    }

    // JPA가 기본적으로 제공하는 find 메서드를 이용하여 univ를 반환
    public University findOne(Long id){
        return em.find(University.class, id);
    }

    /*
     * Entity 객체를 대상으로 쿼리, 테이블에 쿼리를 날리는게 아님.
     * jpql은 나중에 따라 공부하기
     */
    public List<University> findAll(){
        return em.createQuery("select u from University u", University.class).getResultList();
    }

    // 이름으로 대학교 찾기
    public List<University> findByName(String name){
        return em.createQuery("select u from University u where u.name = :name", University.class)
                .setParameter("name", name)
                .getResultList();
    }


}
