package com.eksad.latihanspringmvc.controller;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eksad.latihanspringmvc.model.Brand;
import com.eksad.latihanspringmvc.repository.BrandRepositoryDAO;

@Controller
@RequestMapping("/brand")
public class BrandController {
	
	@Autowired
	BrandRepositoryDAO brandRepositoryDAO;
	
	@RequestMapping("")
	public String daftar(Model modelo) {
		List<Brand> listBrand = brandRepositoryDAO.findAll();
		modelo.addAttribute("listBrand", listBrand);
		return "listBrand";
	}
	
// -----------------------------------------------------------
	
	@RequestMapping("/add")
	public String add(Model modelo) {
		Brand brand = new Brand();
		
		modelo.addAttribute("brand", brand);
		
		return "addBrand";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute Brand brand) {
		brandRepositoryDAO.save(brand);
		return "redirect:/brand";
	}
	
// --------------------------------------------------------------------------------------------------------------
	
// ---------------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String editBrand(@PathVariable Long id, Model modelo) {
		Brand brand = brandRepositoryDAO.findOne(id);
		modelo.addAttribute("brand", brand);
		return "addBrand";
	}
	
	//Delete
		@RequestMapping(value="delete/{id}", method = RequestMethod.GET)
	    public String deleteBrand(@PathVariable("id") Long id) {
	        Brand brand = brandRepositoryDAO.getOne(id);
	        if(brand==null)
	        {
	        	throw new EntityNotFoundException("entity.department.NotFound");
	        }
	        brandRepositoryDAO.delete(brand);
	        return "redirect:/brand/";
	    }

}
