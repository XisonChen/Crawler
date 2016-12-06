package com.xison.mapper;

import com.xison.mapper.model.WebPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

/**
 * Created by admin on 2016/12/6.
 */
public interface WebPageMapper extends JpaRepository<WebPage, String> {

    WebPage findTopByStatus(WebPage.Status status);

    @Modifying
    @Transactional
    @Query("update WebPage w set w.status = ?1")
    void resetStatus(WebPage.Status status);
}
