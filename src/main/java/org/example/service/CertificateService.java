package org.example.service;

import org.example.models.GiftCertificate;

import java.util.List;

public interface CertificateService {

    void addNote(GiftCertificate giftCertificate);
    List<GiftCertificate> showAllCertificates();
    List<GiftCertificate> searchBySubstring(String substring);
    void deleteCertificate(Long id);
    GiftCertificate showNoteById(Long id);
    void update(Long id, GiftCertificate giftCertificate);
}
