package repository_jpa;
import factory.DbFactory;
import jakarta.persistence.EntityManager;
import models.clientes.Cliente;
import models.veiculos.Veiculo;
import java.util.List;

public class VeiculosRepository {
    private static EntityManager entityManager;

    public static void saveAccount(Veiculo veiculo){
        entityManager = DbFactory.configFactoryDataBase();

        try{
            entityManager.persist(veiculo);
            DbFactory.saveAndClose(entityManager);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            //Se a transição não for realizada com sucesso, volte para a versão anterior.
            entityManager.getTransaction().rollback();
        }
    }

    // Retorna os valores da tabela utilizando o id.
    public static Veiculo getById(final int idVeiculo) {
        entityManager = DbFactory.configFactoryDataBase();
        return entityManager.find(Veiculo.class, idVeiculo);
    }

    public static List<Veiculo> listAll(){
        String query = "SELECT veiculo FROM Veiculo veiculo";
        entityManager = DbFactory.configFactoryDataBase();
        return entityManager.createQuery(query, Veiculo.class).getResultList();
    }

    public static void removeAccountById(final int idVeiculo) {
        entityManager = DbFactory.configFactoryDataBase();

        try{
            Veiculo veiculo = getById(idVeiculo);
            entityManager.remove(veiculo);
            DbFactory.saveAndClose(entityManager);

        }catch(Exception ex){
            System.out.println(ex.getMessage()); // Mostra o motivo do error.
            entityManager.getTransaction().rollback();
        }
    }

    public static void updateAccount(Veiculo veiculoAtualizado){
        entityManager = DbFactory.configFactoryDataBase();

        try{
            entityManager.merge(veiculoAtualizado);
            DbFactory.saveAndClose(entityManager);

        }catch(Exception ex){
            System.out.println(ex.getMessage());
            entityManager.getTransaction().rollback();
        }
    }
}