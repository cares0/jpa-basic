package Test;

import hellojpa.Member;
import hellojpa.Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class TestMain {

/*
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        try {
//            MemberTest memberTest = new MemberTest();
//            ProductTest productTest = new ProductTest();
//            productTest.setMemberTest(memberTest);
//            em.persist(memberTest);
//            em.persist(productTest);
            MemberTest memberTest = em.find(MemberTest.class, 1L);
            System.out.println("===========");
            List<ProductTest> productTests = memberTest.getProductTests();

            for (ProductTest productTest : productTests) {
                System.out.println("productTest = " + productTest.getId());
            }
            System.out.println("===========");

            ProductTest productTest = em.find(ProductTest.class, 2L);
            MemberTest find = productTest.getMemberTest();
            System.out.println("find.getId() = " + find.getId());
            List<ProductTest> productTestsFind = find.getProductTests();
            for (ProductTest test : productTestsFind) {
                System.out.println("test = " + test);
            }


//            em.flush();
//            em.clear();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
*/

}
