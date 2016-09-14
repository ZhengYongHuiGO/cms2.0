package com.otryin.cms.service.impl;

import com.otryin.cms.common.Page;
import com.otryin.cms.dao.CrowFoundDao;
import com.otryin.cms.entity.CrowFound;
import com.otryin.cms.service.CrowFoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/9/14.
 */
@Service("crowFoundService")
public class CrowFoundServiceImpl implements CrowFoundService {
    @Autowired
    private CrowFoundDao crowFoundDao;
    public Page<CrowFound> getCrowFoudnPage(int page, int pageSize) {
        List<CrowFound> crowFounds=crowFoundDao.getCrowFoundList((page-1)*pageSize,pageSize);
        int totalNum=crowFoundDao.getCrowFoundNum();
        Page<CrowFound> cfPage=new Page<CrowFound>((page-1)*pageSize,pageSize,totalNum,crowFounds);
        return cfPage;
    }
}
