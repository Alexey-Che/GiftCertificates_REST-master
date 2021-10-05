package org.example.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tags")
public class Tag {

    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
//    @ManyToMany
//    @JoinTable(name = "tag_gift", joinColumns = @JoinColumn(name = "tag_id"), inverseJoinColumns = @JoinColumn(name = "gift_id"))
//    private List<GiftCertificate> certificates;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
//    public List<GiftCertificate> getCertificates() {
//        return certificates;
//    }
//
//    public void setCertificates(List<GiftCertificate> certificates) {
//        this.certificates = certificates;
//    }
}
