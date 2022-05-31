package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        try {
            Member member1 = new Member(150L, "A");
            Member member2 = new Member(160L, "B");

            // 영속성 컨텍스트에 객체, 쿼리문 저장
            em.persist(member1);
            em.persist(member2);

            // 커밋 직전에 쿼리문이 DB로 날라가게 됨
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
