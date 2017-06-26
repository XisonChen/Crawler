package com.xison.controller;

import com.xison.reposittory.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by admin on 2016/12/6.
 */
@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;

    @GetMapping({"/songs", ""})
    public String songs(Model model,
                        @PageableDefault(size = 100, sort = "commentCount", direction = Sort.Direction.DESC) Pageable pageable) {
        model.addAttribute("songs", songRepository.findAll(pageable));
        return "songs";
    }

}
