package com.mehmetyildirim.billingsystem.repository;

import com.mehmetyildirim.billingsystem.entity.Fatura;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by meyildirim on 17.08.2016.
 */
@org.springframework.stereotype.Repository
public interface FaturaRepository extends Repository<Fatura, Integer> {

    @Query("select t from Fatura t")
    public List<Fatura> findAll();

    @Query("select t from Fatura t where t.aboneNo = ?1 and t.odendi = false")
    public List<Fatura> findByAboneNoAndOdendiFalse(String aboneNo);
}
