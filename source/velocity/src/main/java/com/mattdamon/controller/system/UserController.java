package com.mattdamon.controller.system;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mattdamon.core.exception.CoreException;
import com.mattdamon.model.system.SysUserEntity;

@Controller
@RequestMapping(value = "/system")
public class UserController {

	@RequestMapping(value = "/user/show.action", method = RequestMethod.GET)
	public ModelAndView show() throws CoreException {
		try {
			List<SysUserEntity> users = new ArrayList<SysUserEntity>();
			SysUserEntity user1 = new SysUserEntity();
			user1.setId("00001");
			SysUserEntity user2 = new SysUserEntity();
			user2.setId("00002");
			SysUserEntity user3 = new SysUserEntity();
			user3.setId("00003");
			users.add(user1);
			users.add(user2);
			users.add(user3);
			ModelAndView mv = new ModelAndView("/view/system/user.html");
			mv.addObject("users", users);
			return mv;
		} catch (Exception ex) {
			throw new CoreException(ex);
		}

	}

	@RequestMapping(value = "/user/view.action", method = RequestMethod.GET)
	public ModelAndView view() throws CoreException {
		try {
			List<SysUserEntity> users = new ArrayList<SysUserEntity>();
			SysUserEntity user1 = new SysUserEntity();
			user1.setId("00001");
			SysUserEntity user2 = new SysUserEntity();
			user2.setId("00002");
			SysUserEntity user3 = new SysUserEntity();
			user3.setId("00003");
			users.add(user1);
			users.add(user2);
			users.add(user3);
			ModelAndView mv = new ModelAndView("user.vm");
			mv.addObject("users", users);
			return mv;
		} catch (Exception ex) {
			throw new CoreException(ex);
		}

	}

}
