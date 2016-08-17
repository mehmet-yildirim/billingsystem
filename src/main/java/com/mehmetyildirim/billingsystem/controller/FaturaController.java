package com.mehmetyildirim.billingsystem.controller;

import com.mehmetyildirim.billingsystem.entity.Fatura;
import com.mehmetyildirim.billingsystem.repository.FaturaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by meyildirim on 17.08.2016.
 */
@Controller
@Slf4j
public class FaturaController {

    @Autowired
    private FaturaRepository faturaRepository;

    @RequestMapping(value = "/")
    public String indexPage() {
        return "index";
    }

    @RequestMapping(value = "/sorgu")
    public String sorguPage(@RequestParam("aboneNo") String aboneNo, Model model) {

        List<Fatura> faturaList = faturaRepository.findByAboneNoAndOdendiFalse(aboneNo);
        log.info("Gelen faturalar: {}", faturaList.toString());

        model.addAttribute("faturalar", faturaList);

        return "sorgu";
    }
}
