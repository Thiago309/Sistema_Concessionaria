/*package repository_jpa;

import factory.ContaFactory;
import jakarta.persistence.EntityManager;
import model.conta.Conta;

import java.util.List;

public class ContasRepository {
    private static EntityManager entityManager;

    public static void salvarConta(Conta conta){
        entityManager = ContaFactory.configFactoryConta();
        try{
            entityManager.persist(conta);
            ContaFactory.saveAndClose(entityManager);
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    // Retorna os valores da tabela utilizando o id.
    public static Conta getById(final int id) {
        entityManager = ContaFactory.configFactoryConta();
        return entityManager.find(Conta.class, id);
    }

    @SuppressWarnings("unchecked")
    public static List<Conta> listAll(){
        entityManager = ContaFactory.configFactoryConta();

        return entityManager.createQuery("SELECT c FROM Conta c", Conta.class).getResultList();
    }

    public static void removerContaPorId(final int id) {
        entityManager = ContaFactory.configFactoryConta();
        try {
            Conta conta = getById(id);
            entityManager.remove(conta);
            ContaFactory.saveAndClose(entityManager);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
*/
