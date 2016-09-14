package com.otryin.cms.dao;

import com.otryin.cms.common.Page;
import com.otryin.cms.entity.Banner;
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
public class BannerDaoTest {
    @Autowired
    private BannerDao bannerDao;
    @Test
    public void testGetBannerList() throws Exception {

        System.out.println(new Page<Banner>(0,10,5,bannerDao.getBannerList()).toString());
    }

    @Test
    public void testGetBannerById() throws Exception {
        System.out.println(bannerDao.getBannerById(2).toString());
    }
}