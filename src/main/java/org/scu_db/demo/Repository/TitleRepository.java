package org.scu_db.demo.Repository;

import org.scu_db.demo.model.Title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TitleRepository extends JpaRepository<Title, String> {
//继承于JpaRepository,其中Title为对应的实体类，String为实体类主键属性

    /*Title findTitlesByCallNumber(String callnumber);

    @Query(value = "select * from title where callnumber =?1", nativeQuery = true)
    List<Title> findTitleByCallNumberUseSql(String callnumber);*/

    //设置事务注解，当操作失败时进行回滚

}
