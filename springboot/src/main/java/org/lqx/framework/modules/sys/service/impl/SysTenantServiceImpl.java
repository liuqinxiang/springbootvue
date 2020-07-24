package org.lqx.framework.modules.sys.service.impl;

import org.lqx.framework.modules.sys.entity.SysTenant;
import org.lqx.framework.modules.sys.mapper.SysTenantMapper;
import org.lqx.framework.modules.sys.service.SysTenantService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 租户信息 服务实现类
 * </p>
 *
 * @author dean.x.liu
 * @since 2020-07-05
 */
@Service
public class SysTenantServiceImpl extends ServiceImpl<SysTenantMapper, SysTenant> implements SysTenantService {

}
