package com.lening.mapper;

import com.lening.entity.Player;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlayerMapper {
    List<Player> getAll();


    void dele(@Param("array") Long[] array);
}
