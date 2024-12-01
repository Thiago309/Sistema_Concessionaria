package repository_jpa;
import factory.DbFactory;
import jakarta.persistence.EntityManager;
import models.servicos.Seguro;
import java.util.List;

public class SegurosRepository {
    private static EntityManager entityManager;

    public static void saveAccount(Seguro seguro){
        entityManager = DbFactory.configFactoryDataBase();

        try{
            entityManager.persist(seguro);
            DbFactory.saveAndClose(entityManager);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            //Se a transição não for realizada com sucesso, volte para a versão anterior.
            entityManager.getTransaction().rollback();
        }
    }

    // Retorna os valores da tabela utilizando o id.
    public static Seguro getById(final int idseguro) {
        entityManager = DbFactory.configFactoryDataBase();
        return entityManager.find(Seguro.class, idseguro);
    }

    public static List<Seguro> listAll(){
        String query = "SELECT seguro FROM Seguro seguro";
        entityManager = DbFactory.configFactoryDataBase();
        return entityManager.createQuery(query, Seguro.class).getResultList();
    }

    public static void removeAccountById(final int idseguro) {
        entityManager = DbFactory.configFactoryDataBase();

        try{
            Seguro seguro = getById(idseguro);
            entityManager.remove(seguro);
            DbFactory.saveAndClose(entityManager);

        }catch(Exception ex){
            System.out.println(ex.getMessage()); // Mostra o motivo do error.
            entityManager.getTransaction().rollback();
        }
    }
}