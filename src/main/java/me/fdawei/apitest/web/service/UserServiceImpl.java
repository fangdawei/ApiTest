package me.fdawei.apitest.web.service;

import java.util.List;
import javax.annotation.Resource;
import me.fdawei.apitest.web.dao.UserDao;
import me.fdawei.apitest.web.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Resource UserDao userDao;

  public List<User> getAllUser() {
    return userDao.getAllUser();
  }
}
