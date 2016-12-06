package com.xison.mapper;

import com.xison.mapper.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by admin on 2016/12/6.
 */
public interface SongMapper extends JpaRepository<Song, String> {

    List<Song> findByCommentCountGreaterThan(Long commentCount);
}
