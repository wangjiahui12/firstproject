package com.lening.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 创作时间：2020/8/17 16:04
 * 作者：李增强
 */
@Data
public class ResultVo implements Serializable {
    private boolean flag;
    private String msg;

    public ResultVo(boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public ResultVo() {
    }
}
