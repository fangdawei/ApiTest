package me.fdawei.apitest.web.dao;

import java.util.List;
import me.fdawei.apitest.web.entity.User;

public interface UserDao {
  List<User> getAllUser();
}
