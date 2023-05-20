package club.mrxiao.sf.bean.order;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <pre>
 * 顺丰运单号
 * </pre>
 *
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
@Data
public class WaybillNoInfo implements Serializable {

    private static final long serialVersionUID = -48743451697427311L;

    /**
     * 运单号类型1：母单 2 :子单 3 : 签回单
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Integer waybillType;

    /**
     * 运单号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String waybillNo;


    /**
     * 客户订单号
     */
    private String orderId;
    /**
     * 子单号,英文逗号分隔
     */
    private String waybillChilds;
    /**
     * 月结帐号
     */
    private String customerAcctCode;
    /**
     * 计费重量
     */
    private BigDecimal meterageWeightQty;
    /**
     * 实际重量
     */
    private BigDecimal realWeightQty;
    /**
     * 收件员工号
     */
    private String consigneeEmpCode;
    /**
     * 派件员工号
     */
    private String deliverEmpCode;
    /**
     * 快件内容
     */
    private String cargoTypeCode;
    /**
     * 快件内容名称
     */
    private String cargoTypeName;
    /**
     * 时效类型
     */
    private String limitTypeCode;
    /**
     * 时效类型名称
     */
    private String limitName;
    /**
     * 业务类型
     */
    private String expressTypeCode;
    /**
     * 业务类型名称
     */
    private String expressTypeName;
    /**
     * 声明价值
     */
    private BigDecimal consValue;
    /**
     * 声明价值币种
     */
    private String consValueCurrencyCode;
    /**
     * 产品代码
     */
    private String productCode;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 寄件省份
     */
    private String jProvince;
    /**
     * 寄件城市
     */
    private String jCity;
    /**
     * 寄件详细地址
     */
    private String consignorAddr;
    /**
     * 寄件联系人
     */
    private String consignorContName;
    /**
     * 寄件电话号码
     */
    private String consignorPhone;
    /**
     * 寄件手机号
     */
    private String consignorMobile;
    /**
     * 收件省份
     */
    private String dProvince;
    /**
     * 收件城市
     */
    private String dCity;
    /**
     * 收件详细地址
     */
    private String addresseeAddr;
    /**
     * 收件联系人
     */
    private String addresseeContName;
    /**
     * 收件电话号码
     */
    private String addresseePhone;
    /**
     * 收件手机号
     */
    private String addresseeMobile;
}
