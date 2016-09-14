package com.otryin.cms.dao;

import com.otryin.cms.entity.CrowFound;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2016/9/7.
 */
public interface CrowFoundDao {
    CrowFound getCrowFoundById(int cfId);

    /**
     * 获取项目列表
     * @param offset 偏移量
     * @param limit  一次查询获得的最多数量
     * @return
     */
    List<CrowFound> getCrowFoundList(@Param("offset") int offset,@Param("limit") int limit);
    int getCrowFoundNum();
}
