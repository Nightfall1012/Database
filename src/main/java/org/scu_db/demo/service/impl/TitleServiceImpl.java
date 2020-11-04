package org.scu_db.demo.service.impl;

import org.scu_db.demo.Repository.TitleRepository;
import org.scu_db.demo.model.Title;
import org.scu_db.demo.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "TitleService")
public class TitleServiceImpl implements TitleService {

    @Autowired
    private TitleRepository titleRepository;

    @Override
    public List<Title> findAllTitles() {
        return titleRepository.findAll();
    }
/*
    @Override
    public Title findTitleByCallNumber(String callnumber) {
        return titleRepository.findTitlesByCallNumber(callnumber);
    }

    @Override
    public List<Title> findTitleByCallNumberUseSql(String callnumber) {
        return titleRepository.findTitleByCallNumberUseSql(callnumber);
    }*/
}
