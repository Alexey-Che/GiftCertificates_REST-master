package org.example.service;

import org.example.dao.GiftCertificateDao;
import org.example.models.GiftCertificate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateServiceImpl implements CertificateService{

    private final GiftCertificateDao giftCertificateDao;

    @Autowired
    public CertificateServiceImpl(GiftCertificateDao giftCertificateDao) {
        this.giftCertificateDao = giftCertificateDao;
    }

    @Override
    public void addNote(GiftCertificate giftCertificate) {

    }

    @Override
    public List<GiftCertificate> showAllCertificates() {
        return giftCertificateDao.showAllCertificates();
    }

    @Override
    public List<GiftCertificate> searchBySubstring(String substring) {
        return null;
    }

    @Override
    public void deleteCertificate(Long id) {

    }

    @Override
    public GiftCertificate showNoteById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, GiftCertificate giftCertificate) {

    }
}
