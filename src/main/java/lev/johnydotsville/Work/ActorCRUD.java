package lev.johnydotsville.Work;

import java.util.List;

import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.transaction.Transaction;
import jakarta.transaction.Transactional;

import org.hibernate.Session;

import lev.johnydotsville.Entities.Actor;
import lev.johnydotsville.Helpers.HibernateHelper;

public class ActorCRUD {
    public void save(Actor actor) {
        Session session = HibernateHelper.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(actor);
        session.flush();
        session.close();
    }

    public void delete(Actor actor) {
        Session session = HibernateHelper.getSessionFactory().openSession();
        session.beginTransaction();
        session.remove(actor);
        session.flush();
        session.close();
    }

    // Выборку реализовать по исходному гайду не удалось
    public List<Actor> getAll() {
        Session session = HibernateHelper.getSessionFactory().openSession();
        return null;
        //return session.createCriteria(Actor.class).list();  // Вообще нет такого метода
    }

    public Actor getById(int id) {
        Session session = HibernateHelper.getSessionFactory().openSession();
        return session.load(Actor.class, id);
    }
}
