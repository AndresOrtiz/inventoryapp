package com.companyname.springapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.companyname.springapp.domain.Store;
import com.companyname.springapp.service.StoreService;

@Controller
@RequestMapping(value="/addstore.htm")
public class AddStoreFormController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private StoreService storeService;

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid Store store, BindingResult result)
    {
        if (result.hasErrors()) {
            return "addstore";
        }
		
        logger.info("Add " + store);

        storeService.create(store);

        return "redirect:/hello.htm";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    protected Store formBackingObject(HttpServletRequest request) throws ServletException {
        Store store = new Store();
        store.setAddress("");
        store.setId("");
        return store;
    }

	public StoreService getStoreService() {
		return storeService;
	}

	public void setStoreService(StoreService storeService) {
		this.storeService = storeService;
	}

}

