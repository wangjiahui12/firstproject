package com.lening.service.impl;

import com.lening.entity.Player;
import com.lening.mapper.PlayerMapper;
import com.lening.service.PlayerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Resource
    private PlayerMapper playerMapper;
    public List<Player> getAll() {
        return playerMapper.getAll();
    }

    public void dele(Long[] ids) {
        if (ids!=null&&ids.length>=1){
            playerMapper.dele(ids);

        }
    }
}
