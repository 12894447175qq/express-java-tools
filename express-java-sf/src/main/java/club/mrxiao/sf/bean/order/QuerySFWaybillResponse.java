package club.mrxiao.sf.bean.order;

import club.mrxiao.sf.util.json.SfGsonBuilder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <p> </p>
 *
 * @author hyl.c
 * @date {2023/5/20}
 */
@Data
public class QuerySFWaybillResponse implements Serializable {


    /**
     * 运单信息
     */
    private WaybillNoInfo waybillInfo;
    /**
     * 费用信息
     */
    private List<WaybillFeeInfo> waybillFeeList;


    public static QuerySFWaybillResponse fromJson(String json) {
        return SfGsonBuilder.create().fromJson(json, QuerySFWaybillResponse.class);
    }
}
