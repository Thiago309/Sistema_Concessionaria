package repository_jpa;
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
            System.out.println(ex.getMessage());
            //Se a transição não for realizada com sucesso, volte para a versão anterior.
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
            System.out.println(ex.getMessage()); // Mostra o motivo do error.
            entityManager.getTransaction().rollback();
        }
    }

    public static void updateNcv(Ncv ncvAtualizado){
        entityManager = DbFactory.configFactoryDataBase();

        try{
            entityManager.merge(ncvAtualizado);
            DbFactory.saveAndClose(entityManager);

        }catch(Exception ex){
            System.out.println(ex.getMessage());
            entityManager.getTransaction().rollback();
        }
    }
}