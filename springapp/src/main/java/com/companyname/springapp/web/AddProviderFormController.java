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

import com.companyname.springapp.domain.Provider;
import com.companyname.springapp.service.ProviderService;

@Controller
@RequestMapping(value="/addprovider.htm")
public class AddProviderFormController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private ProviderService providerService;

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid Provider provider, BindingResult result)
    {
        if (result.hasErrors()) {
            return "addprovider";
        }
		
        logger.info("Add " + provider);

        providerService.create(provider);

        return "redirect:/hello.htm";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    protected Provider formBackingObject(HttpServletRequest request) throws ServletException {
        Provider provider = new Provider();
        provider.setAddress("");
        provider.setEmail("");
        provider.setId("");
        provider.setName("");
        provider.setPhone("");
        return provider;
    }

	public ProviderService getProviderService() {
		return providerService;
	}

	public void setProviderService(ProviderService providerService) {
		this.providerService = providerService;
	}

}
