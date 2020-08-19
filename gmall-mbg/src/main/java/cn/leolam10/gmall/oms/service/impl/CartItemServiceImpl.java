package cn.leolam10.gmall.oms.service.impl;

import cn.leolam10.gmall.oms.entity.CartItem;
import cn.leolam10.gmall.oms.mapper.CartItemMapper;
import cn.leolam10.gmall.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author Leo
 * @since 2020-08-16
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
