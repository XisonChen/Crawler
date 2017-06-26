package com.xison.reposittory;

import com.xison.model.Song;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by admin on 2016/12/6.
 */
public interface SongRepository extends JpaRepository<Song, String> {

    List<Song> findByCommentCountGreaterThan(Long commentCount);
}
