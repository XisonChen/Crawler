package com.xison.reposittory;

import com.xison.model.WebPage;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by admin on 2016/12/6.
 */
public interface WebPageRepository extends JpaRepository<WebPage, String> {

    WebPage findTopByStatus(WebPage.Status status);

    @Modifying
    @Transactional
    @Query("update WebPage w set w.status = ?1")
    void resetStatus(WebPage.Status status);
}
