package com.yao.cloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yao.cloud.entities.CommonResult;

/**
 * @author yaozhan
 */
public class CustomerBlockHandler {

    public CommonResult handleException(BlockException exception){
        return new CommonResult(444,exception.getClass().getCanonicalName() + "\t 服务不可用");
    }

    public CommonResult handleException2(BlockException exception) {
        return new CommonResult(444, exception.getClass().getCanonicalName() + "\t 服务不可用");
    }
}
