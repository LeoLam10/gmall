package cn.leolam10.gmall.pms;

import cn.leolam10.gmall.pms.entity.Brand;
import cn.leolam10.gmall.pms.entity.Product;
import cn.leolam10.gmall.pms.service.BrandService;
import cn.leolam10.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;
    @Test
     public void contextLoads() {
        Product product=productService.getById(1);
        System.out.println(product.getBrandName());
    }

    @Test
    public  void test_Mas_Sla(){
        //测试增删改在主库，查在从库
        /*Brand brand=new Brand();
        brand.setName("Te_Brand");
        brandService.save(brand);

        System.out.println("Save Successfully!");*/
        System.out.println(brandService.getById(53));

    }

}
