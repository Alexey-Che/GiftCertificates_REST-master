package org.example.controllers;

import org.example.dto.GiftCertificateDto;
import org.example.models.GiftCertificate;
import org.example.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/certificate")
public class GiftCertificatesController {

    private final CertificateService certificateService;
    private final GiftCertificateDto giftCertificateDto;

    @Autowired
    public GiftCertificatesController(CertificateService certificateService, GiftCertificateDto giftCertificateDto) {
        this.certificateService = certificateService;
        this.giftCertificateDto = giftCertificateDto;
    }

    @GetMapping()
    @ResponseBody
    public List<GiftCertificateDto> getGiftCertificates() {
        List<GiftCertificate> giftCertificates = certificateService.showAllCertificates();
        return giftCertificates
                .stream()
                .map(giftCertificateDto::convertGiftCertificateToDto)
                .collect(Collectors.toList());
    }
}
