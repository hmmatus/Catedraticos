package com.uca.capas.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.uca.capas.domain.*;

import com.uca.capas.domain.User;
import com.uca.capas.domain.Catedratico;

@Controller
public class MainController {
	ArrayList<Catedratico> cats = new ArrayList<Catedratico>();
	
	
	//Controlador principal
	@RequestMapping("/index")
	public ModelAndView initMain() {
		ModelAndView mav=new ModelAndView();
		//mav.addObject("user",User.class);
		mav.setViewName("index");
		return mav;
	}
	//Controlador para el manejo del usuario y contra
	@RequestMapping("/validacion")
	public ModelAndView validation(@RequestParam(value="usuario") String name,
			@RequestParam(value="contrasena") String pass) {
		//El usuario con el cual validara los parametros que manda del jsp
		User user = new User("hector", "pass");
		ModelAndView mav = new ModelAndView();
		if(!name.equals(user.getUsername()) || !pass.equals(user.getPassword())){
			mav.addObject("result", "credenciales invalidas");
			mav.setViewName("index");
		}
		else {
			mav.setViewName("catedratico");
		}
		return mav;
		
	}
	
	//Controlador para validar la busqueda del catedratico
	@RequestMapping("/busqueda")
	public ModelAndView search(@RequestParam(value="cat") String catCode) {
		//Asigno 3 catedraticos que revisara la lista
		cats.add(new Catedratico(1,"Juan","Huiza",25,"0000000","20 enero"));
		cats.add(new Catedratico(2,"Nestor","Aldana",25,"000000001","21 enero"));
		cats.add(new Catedratico(3,"Silvia","Ortiz",30,"000000002","22 enero"));
		ModelAndView mav=new ModelAndView();
		boolean flag=true;
		int i=0;
		int posicion=0;
		
		while(i<cats.size()) {
			if(catCode.equals(cats.get(i).getCodigo()+"")) {
				posicion=i;
				flag=false;
				break;
			}
			i++;
		}
		if(flag) {
			mav.addObject("result","No existe el catedratico en los registros");
			mav.setViewName("catedratico");
		}
		else if(!flag) {
			mav.addObject("catedratico",cats.get(posicion));
			mav.setViewName("informacion");
		}
		
		return mav;
		
	}
}
