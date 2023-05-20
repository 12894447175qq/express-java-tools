package club.mrxiao.sf.bean.order;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p> </p>
 *
 * @author hyl.c
 * @date {2023/5/20}
 */
@Data
public class WaybillFeeInfo implements Serializable {
    /**
     * 费用类型
     */
    private String type;
    /**
     * 费用名称
     */
    private String name;
    /**
     * 费用金额
     */
    private BigDecimal value;
    /**
     * 付款类型：1、寄付；2、到付；3、第三方付
     */
    private String paymentTypeCode;

    /**
     * 结算类型：1为现结；2为月结
     */
    private String settlementTypeCode;
    /**
     * 增值服务代码
     */
    private String serviceProdCode;
    /**
     * 保价金额
     */
    private String insuredValue;

    /**
     * 月结账号
     */
    private String customerAcctCode;
}
