package  main.java.com.inrhythm.controller;

import java.io.File;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.inrhythm.model.Cart;
import main.java.com.inrhythm.service.CartService;

@CrossOrigin(origins = "*", maxAge = 3600)
@Validated
@RestController
public class CartController {
	
	@Autowired
	ServletContext servletContext;
	
	@Autowired
	CartService cartService;

    @RequestMapping(method = RequestMethod.GET, value = "/cart")
    public @ResponseBody Cart greeting() {
        return cartService.getUserCart("pluong85@gmail.com", servletContext.getRealPath("/WEB-INF") + File.separator + "user-carts.txt");
    }
    
    
}
