package com.xfj.shopping.vo;

import com.xfj.commons.result.AbstractRequest;
import com.xfj.commons.tool.exception.ValidateException;
import com.xfj.shopping.constants.ShoppingRetCode;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by mic on 2019/7/23.
 */
@Data
public class UpdateCartNumVO extends AbstractRequest {
    private Long userId;
    private Long itemId;
    private Integer num;
    private String checked;

    @Override
    public void requestCheck() {
        if (userId == null || itemId == null || num == null || StringUtils.isBlank(checked)) {
            throw new ValidateException(ShoppingRetCode.REQUISITE_PARAMETER_NOT_EXIST.getCode(), ShoppingRetCode.REQUISITE_PARAMETER_NOT_EXIST.getMessage());
        }
    }
}
