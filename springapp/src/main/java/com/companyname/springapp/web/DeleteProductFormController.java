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

import com.companyname.springapp.domain.Product;
import com.companyname.springapp.service.ProductService;

@Controller
@RequestMapping(value="/deleteproduct.htm")
public class DeleteProductFormController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid Product product, BindingResult result)
    {
        if (result.hasErrors()) {
            return "deleteproduct";
        }
		
        logger.info("Delete " + product);

        productService.delete(product);

        return "redirect:/hello.htm";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    protected Product formBackingObject(HttpServletRequest request) throws ServletException {
        Product product = new Product();
        product.setAmount(0.0);
        product.setId("");
        product.setPrice(0.0);
        product.setProvider(null);
        product.setStore(null);
        return product;
    }

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

}

