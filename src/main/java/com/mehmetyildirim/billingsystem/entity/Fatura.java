package com.mehmetyildirim.billingsystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by meyildirim on 17.08.2016.
 */
@Entity
@Table(name = "faturalar")
@Data
public class Fatura {

    @Id
    @Column(name = "fatura_id")
    private Integer faturaId;

    @Column(name = "abone_no")
    private String aboneNo;

    @Column(name = "fatura_donemi")
    private String faturaDonemi;

    @Column(name = "tutar")
    private Double tutar;

    @Column(name = "odendi")
    private boolean odendi;

    @Column(name = "sonodeme")
    @Temporal(TemporalType.DATE)
    private Date sonOdemeTarihi;

}
