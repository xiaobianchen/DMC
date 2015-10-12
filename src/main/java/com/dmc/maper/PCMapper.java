package com.dmc.maper;

import com.dmc.domain.PC;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xiaobianchen on 15/10/12.
 */
public interface PCMapper {
    @Select("SELECT * FROM pc")
    List<PC> listAll();
}
