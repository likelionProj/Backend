package backend.springproj.repository;

import backend.springproj.domain.Cafe;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CafeRepository {

    @PersistenceContext
    private final EntityManager em;

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
}
