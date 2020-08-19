package cn.leolam10.gmall.pms.service.impl;

import cn.leolam10.gmall.pms.entity.Product;
import cn.leolam10.gmall.pms.mapper.ProductMapper;
import cn.leolam10.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Leo
 * @since 2020-08-16
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
