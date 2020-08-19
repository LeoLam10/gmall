package cn.leolam10.gmall.ums.service.impl;

import cn.leolam10.gmall.ums.entity.Member;
import cn.leolam10.gmall.ums.mapper.MemberMapper;
import cn.leolam10.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Leo
 * @since 2020-08-16
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
