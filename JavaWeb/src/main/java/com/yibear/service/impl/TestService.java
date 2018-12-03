package com.yibear.service.impl;

import com.yibear.dao.TestDao;
import com.yibear.service.ITestService;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {
    private TestDao testDao;

    @Override
    public String selectUserById(int i) {
        return testDao.selectUserById(i);
    }
}
