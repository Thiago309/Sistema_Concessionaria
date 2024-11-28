package factory;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class ContaFactory {
    public static EntityManagerFactory emf;

    public static EntityManager configFactoryConta() {
        emf = Persistence.createEntityManagerFactory("SistemaConcessionaria");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        return em;
    }

    public static void saveAndClose(EntityManager em){
        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
/* Pesquisar sobre: Clean code.*/