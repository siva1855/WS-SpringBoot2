package siva.bootmvc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import siva.bootmvc.model.Student;

@Controller
public class DataToUIController {

	@RequestMapping("/legacyModelMap")
	public String showDataModelMap(ModelMap modelMap) {

		// primitive data
		modelMap.addAttribute("id", 10);
		modelMap.addAttribute("name", "sivakumar");
		modelMap.addAttribute("course", "java");

		// Object Data
		Student student = new Student(101, "siva", "SpringBoot");
		modelMap.addAttribute("studentData", student);

		// collection data
		List<String> list = List.of("core java", "Spring", "boot", "Angular");
		modelMap.addAttribute("listData", list);

		Map<Integer, String> map = Map.of(8, "OOPs", 7, "Collections", 5, "MultiThreading");
		modelMap.addAttribute("mapData", map);

		return "Data";
	}

	@RequestMapping("/legacyModelAndView")
	public ModelAndView showDataModelAndView() {

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("Data");

		// primitive data
		modelAndView.addObject("id", 10);
		modelAndView.addObject("name", "sivakumar");
		modelAndView.addObject("course", "java");

		// Object Data
		Student student = new Student(101, "siva", "SpringBoot");
		modelAndView.addObject("studentData", student);

		// collections (list) data
		List<String> list = List.of("core java", "Spring", "boot", "Angular");
		modelAndView.addObject("listData", list);

		// collections map data
		Map<Integer, String> map = Map.of(8, "OOPs", 7, "Collections", 5, "MultiThreading");
		modelAndView.addObject("mapData", map);

		return modelAndView;
	}
}
