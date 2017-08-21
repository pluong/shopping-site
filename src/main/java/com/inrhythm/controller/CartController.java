package  com.inrhythm.controller;

import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.inrhythm.model.Cart;
import com.inrhythm.model.Product;
import com.inrhythm.service.CartService;
import com.inrhythm.service.MockDataService;

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
