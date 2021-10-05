package org.example.dao;

import org.example.models.GiftCertificate;

import java.util.List;

public interface GiftCertificateDao {


    void addCertificate(GiftCertificate giftCertificate);
    List<GiftCertificate> showAllCertificates();
    List<GiftCertificate> searchBySubstring(String substring);
    void deleteCertificate(Long id);
    GiftCertificate showCertificateById(Long id);
    void updateCertificate(Long id, GiftCertificate giftCertificate);
}
