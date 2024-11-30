package repository_jpa;
import factory.DbFactory;
import jakarta.persistence.EntityManager;
import models.notas.Nvv;
import java.util.List;

public class NvvRepository {
    private static EntityManager entityManager;

    public static void saveAccount(Nvv nvv) {
        entityManager = DbFactory.configFactoryDataBase();

        try{
            entityManager.persist(nvv);
            DbFactory.saveAndClose(entityManager);

        }catch(Exception ex){
            System.out.println(ex.getMessage());
            //Se a transição não for realizada com sucesso, volte para a versão anterior.
            entityManager.getTransaction().rollback();
        }
    }
    // Retorna os valores da tabela utilizando o id.
    public static Nvv getById(final int idNVV){
        entityManager = DbFactory.configFactoryDataBase();
        return entityManager.find(Nvv.class, idNVV);
    }

    public static List<Nvv> listAll(){
        String query = "SELECT nvv FROM Nvv nvv";
        entityManager = DbFactory.configFactoryDataBase();
        return entityManager.createQuery(query, Nvv.class).getResultList();
    }

    public static void removeAccountById(final int idNVV){
        entityManager = DbFactory.configFactoryDataBase();

        try{
            Nvv nvv = getById(idNVV);
            entityManager.remove(nvv);
            DbFactory.saveAndClose(entityManager);

        }catch(Exception ex){
            System.out.println(ex.getMessage()); // Mostra o motivo do error.
            entityManager.getTransaction().rollback();
        }
    }
}