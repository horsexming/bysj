package com.bysj.dao;

import com.bysj.bean.Bgoods;
import com.bysj.bean.BgoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgoodsMapper {
    long countByExample(BgoodsExample example);

    int deleteByExample(BgoodsExample example);

    int insert(Bgoods record);

    int insertSelective(Bgoods record);

    List<Bgoods> selectByExample(BgoodsExample example);

    int updateByExampleSelective(@Param("record") Bgoods record, @Param("example") BgoodsExample example);

    int updateByExample(@Param("record") Bgoods record, @Param("example") BgoodsExample example);
}