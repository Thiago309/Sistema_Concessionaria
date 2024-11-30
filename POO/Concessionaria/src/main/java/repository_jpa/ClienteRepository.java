package repository_jpa;
import factory.DbFactory;
import jakarta.persistence.EntityManager;
import models.clientes.Cliente;
import java.util.List;

public class ClienteRepository {
    private static EntityManager entityManager;

    public static void saveAccount(Cliente cliente){
        entityManager = DbFactory.configFactoryDataBase();

        try{
            entityManager.persist(cliente);
            DbFactory.saveAndClose(entityManager);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            //Se a transição não for realizada com sucesso, volte para a versão anterior.
            entityManager.getTransaction().rollback();
        }
    }

    // Retorna os valores da tabela utilizando o id.
    public static Cliente getById(final int idCliente) {
        entityManager = DbFactory.configFactoryDataBase();
        return entityManager.find(Cliente.class, idCliente);
    }

    public static List<Cliente> listAll(){
        String query = "SELECT cliente FROM Cliente cliente";
        entityManager = DbFactory.configFactoryDataBase();
        return entityManager.createQuery(query, Cliente.class).getResultList();
    }

    public static void removeAccountById(final int idCliente) {
        entityManager = DbFactory.configFactoryDataBase();

        try{
            Cliente cliente = getById(idCliente);
            entityManager.remove(cliente);
            DbFactory.saveAndClose(entityManager);

        }catch(Exception ex){
            System.out.println(ex.getMessage()); // Mostra o motivo do error.
            entityManager.getTransaction().rollback();
        }
    }
}
