package club.mrxiao.sf.bean.print;

import club.mrxiao.sf.util.json.SfGsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ComReceCloudPrintWaybillsRequest {
    /**
     * 接口服务代码
     */
    private static final String SERVICE_CODE = "COM_RECE_CLOUD_PRINT_WAYBILLS";

    /**
     * 模板编码
     */
    private String templateCode;
    /**
     * 业务数据
     */
    private List<PrintSfOrderDocument> documents;
    /**
     * 版本号
     */
    private String version = "2.0";
    /**
     * 生成面单文件格式	pdf格式
     */
    private String fileType;
    /**
     * 是否同步	 true: 同步,false: 异步
     */
    private boolean sync = true;

    /**
     * 自定义模板编码，当需要使用模板编辑器编辑自定义区时，将自定义模板编码赋值该字段
     */
    private String customTemplateCode;


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
