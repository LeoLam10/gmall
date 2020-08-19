package cn.leolam10.gmall.pms.service.impl;

import cn.leolam10.gmall.pms.entity.Comment;
import cn.leolam10.gmall.pms.mapper.CommentMapper;
import cn.leolam10.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author Leo
 * @since 2020-08-16
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
