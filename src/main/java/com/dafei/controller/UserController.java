package com.dafei.controller;

import com.dafei.model.User;
import com.dafei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/select")
    public ModelAndView selectUser() {
        ModelAndView mv = new ModelAndView();
        User user = userService.selectUser(1);
        mv.addObject("user", user);
        mv.setViewName("user");
        return mv;
    }

    @RequestMapping("/allSelect")
    public ModelAndView selectAllUser() {
        ModelAndView mv = new ModelAndView();

        // User user = userService.selectUser(1);
        // mv.addObject("user", user);

        List<User> userAll= userService.selectAllUser();
        mv.addObject("userAll", userAll);

        mv.setViewName("userAll");
        return mv;
    }

    @RequestMapping("toAddUser")
    public String toAddUser() {
        return "addUser";
    }

    @RequestMapping("addUser")
    public String addUser(User user, Model model) {
        userService.save(user);
        return "redirect:/user/allSelect";
    }


    @RequestMapping("/selectOne")
    public String selectUserOne(int id, HttpServletRequest request,Model model) {
        request.setAttribute("user",userService.selectUser(id));
        model.addAttribute("user",userService.selectUser(id));
        return "userOne";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(int id, HttpServletRequest request, Model model) {
        request.setAttribute("user",userService.delete(id));
        return "redirect:/user/allSelect";
    }
}
