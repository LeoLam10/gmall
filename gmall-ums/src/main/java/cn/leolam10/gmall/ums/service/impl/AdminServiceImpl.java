package cn.leolam10.gmall.ums.service.impl;

import cn.leolam10.gmall.ums.entity.Admin;
import cn.leolam10.gmall.ums.mapper.AdminMapper;
import cn.leolam10.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Leo
 * @since 2020-08-16
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
