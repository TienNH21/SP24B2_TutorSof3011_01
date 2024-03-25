package repositories;

import entities.MauSac;
import jakarta.persistence.Query;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class MauSacRepository {
    private Session hSession;

    public MauSacRepository()
    {
        this.hSession = HibernateUtil.getFACTORY().openSession();
    }

    public void create(MauSac ms)
    {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.persist(ms);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            this.hSession.getTransaction().rollback();
        }
    }

    public void update(MauSac ms)
    {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.merge(ms);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            this.hSession.getTransaction().rollback();
        }
    }

    public void delete(MauSac ms)
    {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.remove(ms);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            this.hSession.getTransaction().rollback();
        }
    }

    public MauSac findById(int id)
    {
        return this.hSession.find(MauSac.class, id);
    }

    public List<MauSac> findAll()
    {
        // SELECT * FROM MauSac
        String hql = "SELECT entity FROM MauSac entity";
        Query q = this.hSession.createQuery(hql, MauSac.class);
        return q.getResultList();
    }
}
