package com.otryin.cms.dao;

import com.otryin.cms.entity.CrowFoundBackup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2016/9/9.
 */
public interface CrowFoundBackupDao {
    List<CrowFoundBackup> getCrowFoundBackupList(@Param("offset") int offset, @Param("limit") int limit);
    CrowFoundBackup getCrowFoundBackupById(int cfId);

}
