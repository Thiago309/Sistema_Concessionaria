package repository_jpa;
import factory.DbFactory;
import jakarta.persistence.EntityManager;
import models.servicos.Servico;

import java.util.List;

public class ServicoRepository {
    private static EntityManager entityManager;

    public static void saveAccount(Servico servico){
        entityManager = DbFactory.configFactoryDataBase();

        try{
            entityManager.persist(servico);
            DbFactory.saveAndClose(entityManager);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            //Se a transição não for realizada com sucesso, volte para a versão anterior.
            entityManager.getTransaction().rollback();
        }
    }

    // Retorna os valores da tabela utilizando o id.
    public static Servico getById(final int idservico) {
        entityManager = DbFactory.configFactoryDataBase();
        return entityManager.find(Servico.class, idservico);
    }

    public static List<Servico> listAll(){
        String query = "SELECT servico FROM Servico servico";
        entityManager = DbFactory.configFactoryDataBase();
        return entityManager.createQuery(query, Servico.class).getResultList();
    }

    public static void removeAccountById(final int idservico) {
        entityManager = DbFactory.configFactoryDataBase();

        try{
            Servico servico = getById(idservico);
            entityManager.remove(servico);
            DbFactory.saveAndClose(entityManager);

        }catch(Exception ex){
            System.out.println(ex.getMessage()); // Mostra o motivo do error.
            entityManager.getTransaction().rollback();
        }
    }
}