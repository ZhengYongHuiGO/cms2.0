package com.otryin.cms.dao;

import com.otryin.cms.common.Page;
import com.otryin.cms.entity.CrowFound;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/9/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao-config.xml"})
public class CrowFoundDaoTest {
    @Resource
    private CrowFoundDao crowFoundDao;
    @Test
    public void testGetCrowFoundById() throws Exception {
        System.out.println( crowFoundDao.getCrowFoundById(213).toString());
    }

    @Test
    public void testGetCrowFoundList() throws Exception {
        List<CrowFound> crowFounds=crowFoundDao.getCrowFoundList(0,10);
        int totalNum=crowFoundDao.getCrowFoundNum();
        Page<CrowFound> page=new Page<CrowFound>(0,10,totalNum,crowFounds);
        System.out.println(page.toString());
    }

    @Test
    public void testGetCrowFoundNum() throws Exception {
        System.out.println("总数为"+crowFoundDao.getCrowFoundNum());
    }
}