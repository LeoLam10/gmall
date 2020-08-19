package cn.leolam10.gmall.oms.service.impl;

import cn.leolam10.gmall.oms.entity.OrderItem;
import cn.leolam10.gmall.oms.mapper.OrderItemMapper;
import cn.leolam10.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author Leo
 * @since 2020-08-16
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
