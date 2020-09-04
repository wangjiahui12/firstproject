package com.lening.service;

import com.lening.entity.Player;

import java.util.List;

public interface PlayerService {
    List<Player> getAll();

    void dele(Long[] ids);
}
