package repository_jpa;
import factory.DbFactory;
import jakarta.persistence.EntityManager;
import models.funcionarios.Funcionario;
import java.util.List;

public class FuncionarioRepository {
    private static EntityManager entityManager;

    public static void saveAccount(Funcionario funcionario){
        entityManager = DbFactory.configFactoryDataBase();

        try{
            entityManager.persist(funcionario);
            DbFactory.saveAndClose(entityManager);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            //Se a transição não for realizada com sucesso, volte para a versão anterior.
            entityManager.getTransaction().rollback();
        }
    }

    // Retorna os valores da tabela utilizando o id.
    public static Funcionario getById(final int idfuncionario) {
        entityManager = DbFactory.configFactoryDataBase();
        return entityManager.find(Funcionario.class, idfuncionario);
    }

    public static List<Funcionario> listAll(){
        String query = "SELECT funcionario FROM Funcionario funcionario";
        entityManager = DbFactory.configFactoryDataBase();
        return entityManager.createQuery(query, Funcionario.class).getResultList();
    }

    public static void removeAccountById(final int idfuncionario) {
        entityManager = DbFactory.configFactoryDataBase();

        try{
            Funcionario funcionario = getById(idfuncionario);
            entityManager.remove(funcionario);
            DbFactory.saveAndClose(entityManager);

        }catch(Exception ex){
            System.out.println(ex.getMessage()); // Mostra o motivo do error.
            entityManager.getTransaction().rollback();
        }
    }
}