package com.otryin.cms.dao;

import com.otryin.cms.common.Page;
import com.otryin.cms.entity.CrowFoundBackup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/9/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao-config.xml"})
public class CrowFoundBackupDaoTest {
    @Autowired
    private CrowFoundBackupDao crowFoundBackupDao;
    @Test
    public void testGetCrowFoundBackupList() throws Exception {
        Page<CrowFoundBackup> page=new Page<CrowFoundBackup>(0,10,40,crowFoundBackupDao.getCrowFoundBackupList(0,10));
        System.out.println(page.toString());
    }

    @Test
    public void testGetCrowFoundBackupById() throws Exception {
        System.out.println(crowFoundBackupDao.getCrowFoundBackupById(213).toString());
    }
}