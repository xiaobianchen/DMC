package com.dmc.maper;

import com.dmc.domain.App;
import com.dmc.domain.Flow;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xiaobianchen on 15/10/11.
 */
public interface AppMapper {
    @Select("SELECT * FROM app")
    List<App> listAll();
}
