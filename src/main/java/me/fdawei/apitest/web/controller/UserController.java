package me.fdawei.apitest.web.controller;

import java.util.List;
import javax.annotation.Resource;
import me.fdawei.apitest.web.entity.JsonResponse;
import me.fdawei.apitest.web.entity.User;
import me.fdawei.apitest.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
  @Resource UserService userService;

  @RequestMapping(value = "/alluser", method = RequestMethod.GET)
  public @ResponseBody JsonResponse<List<User>> allUser() {
    JsonResponse<List<User>> response = new JsonResponse<List<User>>();
    try {
      response.setCode(0);
      response.setData(userService.getAllUser());
      response.setMsg("success");
    } catch (Exception e) {
      response.setCode(-1);
      response.setMsg(e.getMessage());
    }
    return response;
  }
}
