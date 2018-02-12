import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController{
  public AtomicLong counter = new AtomicLong();
  
  @RequestMapping("/products")
  public String productEndpoint(){
		String product = String.format("Item %s",counter.incrementAndGet());
		return product;
	}
}
