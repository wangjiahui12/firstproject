package com.lening.controller;

import com.lening.entity.Player;
import com.lening.entity.ResultVo;
import com.lening.service.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import java.util.List;

@Controller
public class PlayerController {
    @Resource
    private PlayerService playerService;
    @RequestMapping("/getAll")
    @ResponseBody
    public List<Player> getAll(){
        List<Player> list = playerService.getAll();
        return list;
    }
    @RequestMapping("/dele")
    @ResponseBody
    public ResultVo dele(@RequestBody Long[] ids){
        try {
            playerService.dele(ids);
            return new ResultVo(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(false,"删除失败");
        }
    }
}
