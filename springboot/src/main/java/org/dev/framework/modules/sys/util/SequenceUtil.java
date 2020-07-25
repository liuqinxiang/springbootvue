package org.dev.framework.modules.sys.util;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.dev.framework.modules.sys.entity.SysSequence;
import org.dev.framework.modules.sys.service.SysSequenceService;
import org.dev.framework.exception.CustomException;
import org.dev.framework.modules.sys.entity.SysSequence;
import org.dev.framework.modules.sys.mapper.QuartzMapper;
import org.dev.framework.modules.sys.service.SysSequenceLogService;
import org.dev.framework.modules.sys.service.SysSequenceQueueService;
import org.dev.framework.modules.sys.service.SysSequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SequenceUtil {

    @Autowired
    SysSequenceService sysSequenceService;

    @Autowired
    SysSequenceLogService sysSequenceLogService;

    @Autowired
    SysSequenceQueueService sysSequenceQueueService;

    /**
     * 生成流水码
     *
     * @param SequenceCode
     * @return
     */
    public synchronized String GeneratorCode(String SequenceCode) throws CustomException {
        String flowCode = "";
        SysSequence sysSequence = new SysSequence();
        sysSequence.setCode(SequenceCode);
        QueryWrapper queryWrapper = new QueryWrapper(sysSequence);
        sysSequence = this.sysSequenceService.getOne(queryWrapper);
        if (sysSequence == null) {
            throw new CustomException("编码不存在");
        }
        //查看队列中是否有数据


        return flowCode;
    }


}
