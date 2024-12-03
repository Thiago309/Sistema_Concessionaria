package repository_jpa;
import factory.DbFactory;
import jakarta.persistence.EntityManager;
import models.clientes.Cliente;
import models.servicos.Manutencao;
import models.servicos.Servico;
import java.util.List;

public class ManutencaoRepository {
    private static EntityManager entityManager;

    public static void saveAccount(Manutencao manutencao) {
        entityManager = DbFactory.configFactoryDataBase();

        try{
            entityManager.persist(manutencao);
            DbFactory.saveAndClose(entityManager);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            //Se a transição não for realizada com sucesso, volte para a versão anterior.
            entityManager.getTransaction().rollback();
        }
    }

    // Retorna os valores da tabela utilizando o id.
    public static Manutencao getById(final int idManutencao) {
        entityManager = DbFactory.configFactoryDataBase();
        return entityManager.find(Manutencao.class, idManutencao);
    }

    public static List<Manutencao> listAll(){
        String query = "SELECT manutencao FROM Manutencao manutencao";
        entityManager = DbFactory.configFactoryDataBase();
        return entityManager.createQuery(query, Manutencao.class).getResultList();
    }

    public static void removeAccountById(final int idManutencao) {
        entityManager = DbFactory.configFactoryDataBase();

        try{
            Manutencao manutencao = getById(idManutencao);
            entityManager.remove(manutencao);
            DbFactory.saveAndClose(entityManager);

        }catch(Exception ex){
            System.out.println(ex.getMessage()); // Mostra o motivo do error.
            entityManager.getTransaction().rollback();
        }
    }

    public static void updateAccount(Manutencao manutencaoAtualizada) {
        entityManager = DbFactory.configFactoryDataBase();

        try{
            entityManager.merge(manutencaoAtualizada);
            DbFactory.saveAndClose(entityManager);

        }catch(Exception ex){
            System.out.println(ex.getMessage());
            entityManager.getTransaction().rollback();
        }
    }
}