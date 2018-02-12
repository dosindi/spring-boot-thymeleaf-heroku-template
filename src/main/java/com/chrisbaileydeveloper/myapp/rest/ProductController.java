import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api")
public class ProductController{
  public AtomicLong counter = new AtomicLong();
  
  @RequestMapping("/products")
  public String productEndpoint(@RequestParam(value="name", defaultValue="World") String name){
		String product = String.format("Item %s",counter.incrementAndGet()+"");
		return product;
	}
}
