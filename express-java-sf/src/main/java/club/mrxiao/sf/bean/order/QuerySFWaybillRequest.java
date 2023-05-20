package club.mrxiao.sf.bean.order;

import club.mrxiao.sf.util.json.SfGsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p> </p>
 *
 * @author hyl.c
 * @date {2023/5/20}
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuerySFWaybillRequest implements Serializable {

    private static final String SERVICE_CODE = "EXP_RECE_QUERY_SFWAYBILL";


    /**
     * 是	1:表示按订单查询 2:表示按运单查询
     */
    private String trackingType;
    /**
     * 是	订单号或运单号；
     */
    private String trackingNum;

    /**
     * String	条件	配置校验手机号时必传，支持最高6个收寄方电话后4位下发， 每个电话号码使用英文逗号分隔
     */
    private String phone;

    /**
     * String	否	业务配置代码，针对客户业务需求配置的一套接口处理逻辑，一个接入编码可对应多个业务配置代码
     */
    private String bizTemplateCode;

    /**
     * 获取接口服务代码
     *
     * @return 接口服务代码
     */
    public String getServiceCode() {
        return SERVICE_CODE;
    }

    /**
     * 转json
     *
     * @return json数据
     */
    public String toJson() {
        return SfGsonBuilder.create().toJson(this);
    }
}
