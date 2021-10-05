package org.example.dao;

import org.example.models.GiftCertificate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class GiftCertificateDaoImpl implements GiftCertificateDao {

    @PersistenceContext
    private final EntityManager entityManager;

    @Autowired
    public GiftCertificateDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public void addCertificate(GiftCertificate giftCertificate) {

    }

    @Override
    @Transactional()
    public List<GiftCertificate> showAllCertificates() {
        return entityManager.createQuery("select s from GiftCertificate s",
                GiftCertificate.class).getResultList();
    }

    @Override
    public List<GiftCertificate> searchBySubstring(String substring) {
        return null;
    }

    @Override
    public void deleteCertificate(Long id) {

    }

    @Override
    public GiftCertificate showCertificateById(Long id) {
        return null;
    }

    @Override
    public void updateCertificate(Long id, GiftCertificate giftCertificate) {

    }
}
