package backend.springproj.repository;

import backend.springproj.domain.Cafe;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CafeRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Cafe cafe){
        em.persist(cafe);
        return cafe.getId();
    }

    public Cafe findOne(Long id){
        return em.find(Cafe.class, id);
    }

    public List<Cafe> findAll(){
        return em.createQuery("select c from Cafe c", Cafe.class).getResultList();
    }

    public List<Cafe> findByName(String name) {
        return em.createQuery("select c from Cafe c where c.name = :name", Cafe.class)
                .setParameter("name", name)
                .getResultList();
    }

    // moodStatus를 이용해서 값을 가져와야함
//    public List<Cafe> findByMood(Cafe cafe) {
//        return em.createQuery()
//    }

}
