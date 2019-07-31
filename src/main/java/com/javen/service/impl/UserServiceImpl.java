package com.javen.service.impl;
import javax.annotation.Resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javen.dao.IUserDao;
import com.javen.model.User;
import com.javen.service.IUserService;
  
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Autowired
    private IUserDao userDao;  
    
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
  
}  
