package club.mrxiao.sf.bean.print;

import club.mrxiao.sf.bean.order.CreateOrderResponse;
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
public class ComReceCloudPrintWaybillsResponse {
    private List<PrintFile> files;
    private String clientCode;
    private String templateCode;
    private String fileType;

    public static ComReceCloudPrintWaybillsResponse fromJson(String json) {
        return SfGsonBuilder.create().fromJson(json, ComReceCloudPrintWaybillsResponse.class);
    }


    public static class PrintFile {
        private String url;
        private String token;
        private String waybillNo;
        private Integer seqNo;
        private Integer areaNo;
        private Integer pageNo;
    }
}
