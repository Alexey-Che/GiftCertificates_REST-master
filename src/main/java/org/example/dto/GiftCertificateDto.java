package org.example.dto;

import org.example.models.GiftCertificate;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GiftCertificateDto {

    private final ModelMapper modelMapper;

    @Autowired
    public GiftCertificateDto(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public GiftCertificateDto convertGiftCertificateToDto(GiftCertificate giftCertificate) {
        return modelMapper.map(giftCertificate,
                GiftCertificateDto.class);
    }

    public GiftCertificate convertGiftCertificateDtoToEntity(GiftCertificateDto giftCertificateDto) {
        return modelMapper.map(giftCertificateDto, GiftCertificate.class);
    }
}
