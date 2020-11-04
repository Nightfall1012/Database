package org.scu_db.demo.service;

import org.scu_db.demo.model.Title;

import java.util.List;

public interface TitleService {
    List<Title> findAllTitles();
    /*Title findTitleByCallNumber(String callnumber);
    List<Title> findTitleByCallNumberUseSql(String callnumber);*/
}
