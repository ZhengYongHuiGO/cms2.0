package com.otryin.cms.service;

import com.otryin.cms.common.Page;
import com.otryin.cms.entity.CrowFound;

/**
 * Created by Administrator on 2016/9/14.
 */
public interface CrowFoundService {
    Page<CrowFound> getCrowFoudnPage(int page, int pageSize);
}
