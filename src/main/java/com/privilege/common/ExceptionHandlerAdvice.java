package com.privilege.common;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request){
        ModelAndView view = new ModelAndView("error");
        view.addObject("errorMessage",exception.getMessage());
        return view;
    }

    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("msg","ceshi");
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.setDisallowedFields("id");
    }
}
