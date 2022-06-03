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
            // 프록시 객체 반환
            Member refMember = em.getReference(Member.class, 1L);

            // refMember를 영속성 컨텍스트에서 빼버림 -> 준영속 상태
            em.detach(refMember);
            // em.close(); --> 영속성 컨텍스트를 닫아버리는 경우도 동일

            // 프록시 객체 사용 -> 예외 발생
            refMember.getUserName;

            em.flush();
            em.clear();



            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
