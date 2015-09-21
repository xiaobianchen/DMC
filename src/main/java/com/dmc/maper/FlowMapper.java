package com.dmc.maper;

import com.dmc.domain.Flow;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xiaobianchen on 15/9/21.
 */
public interface FlowMapper {

    @Select("SELECT * FROM flow")
    List<Flow> listAll();

}
