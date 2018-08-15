package com.privilege.controller;

import com.privilege.model.UPermission;
import com.privilege.service.UPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@Scope(value="prototype")
@RequestMapping(value = "/menu")
public class MenuController  {


    @Autowired
    private UPermissionService permissionService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("pages/menus/menu");
        return view;
    }


    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public ModelAndView add() {
        ModelAndView view = new ModelAndView("pages/menus/menuDialog");
        return view;
    }

    @ResponseBody
    @RequestMapping(value = "/findMapByPage",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Map<String,Object> findMapByPage(UPermission permission, Integer start, Integer length, Integer draws){
        Map<String,Object> result = new HashMap<String,Object>();
        System.out.println("menuName:"+permission.getName());
        try {
            Integer pageNum = (start+1)/length+1;
            result = permissionService.findMapByPage(permission, pageNum,  length,draws);
            result.put("Status","0");
        }catch (Exception e){
            result.put("Status","1");
            result.put("Message","系统异常");
        }
        return  result;
    }
}
