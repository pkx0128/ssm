package com.pankx.controller;

import com.pankx.domain.Users;
import com.pankx.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Users控制器类
 */
@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UsersService usersService;

    /**
     * 测试springmvc环境
     * @return
     */
    @RequestMapping("/testSpringmvc")
    public String testSpringmvc(){
        System.out.println("UsersController类的testSpringmvc方法执行了");
        //返回success经视图解析器解析将跳转到/WEB-INF/pages/目录下的success.jsp页面
        return "success";
    }

    /**
     *测试mybatis环境
     * @return
     */
    @RequestMapping("/testfindAll")
    public String testfindAll(Model model){
        System.out.println("UsersController类的testfindAll方法执行了");
        //查询所有用信息
        List<Users> list = usersService.findAll();
        //把数据存入Model
        model.addAttribute("userslist",list);
        return "userslist";
    }

    /**
     * 保存
     * @param users
     */
    @RequestMapping("/testsave")
    public String testsave(Users users){
        System.out.println("testsave执行了。。。。");
        usersService.saveUser(users);
        return "success";
    }
}
