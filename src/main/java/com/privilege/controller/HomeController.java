package com.privilege.controller;


import com.github.pagehelper.PageHelper;
import com.privilege.model.UPermission;
import com.privilege.service.UPermissionService;
import org.apache.ibatis.type.JdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@Scope(value="prototype")
@RequestMapping(value = "/main")
public class HomeController {
    @Autowired
    private UPermissionService permissionService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public ModelAndView index(){
//        PageHelper.startPage(pageNum,pageSize);
        List<UPermission> urls = permissionService.findPermissionByUserId(1L);

        ModelAndView view = new ModelAndView("index");
        view.addObject("urls",urls);
        return  view;
    }


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ModelAndView test(){

        ModelAndView view = new ModelAndView("test");

        return  view;
    }



}
