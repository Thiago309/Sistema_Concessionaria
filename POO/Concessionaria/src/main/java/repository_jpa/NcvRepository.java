package repository_jpa;
import factory.ContaFactory;
import factory.DbFactory;
import jakarta.persistence.EntityManager;
import models.notas.Ncv;
import java.util.List;

public class NcvRepository {
    private static EntityManager entityManager;

    public static void saveAccount(Ncv ncv){
        entityManager = DbFactory.configFactoryDataBase();
        try{
            entityManager.persist(ncv);
            DbFactory.saveAndClose(entityManager);
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    // Retorna os valores da tabela utilizando o id.
    public static Ncv getById(final int idNCV) {
        entityManager = DbFactory.configFactoryDataBase();
        return entityManager.find(Ncv.class, idNCV);
    }

    public static List<Ncv> listAll(){
        String query = "SELECT ncv FROM Ncv ncv";
        entityManager = DbFactory.configFactoryDataBase();
        return entityManager.createQuery(query, Ncv.class).getResultList();
    }

    public static void removeAccountById(final int idNCV) {
        entityManager = DbFactory.configFactoryDataBase();

        try{
            Ncv ncv = getById(idNCV);
            entityManager.remove(ncv);
            DbFactory.saveAndClose(entityManager);

        }catch(Exception ex){
            ex.printStackTrace(); // Mostra o motivo do error.
            entityManager.getTransaction().rollback();
        }
    }
}
