package cn.leolam10.gmall.oms.service.impl;

import cn.leolam10.gmall.oms.entity.Order;
import cn.leolam10.gmall.oms.mapper.OrderMapper;
import cn.leolam10.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Leo
 * @since 2020-08-16
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
