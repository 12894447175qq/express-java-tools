package club.mrxiao.sf.api.impl;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.sf.api.SfPrintService;
import club.mrxiao.sf.api.SfService;
import club.mrxiao.sf.bean.BaseRequest;
import club.mrxiao.sf.bean.order.CreateOrderResponse;
import club.mrxiao.sf.bean.print.ComReceCloudPrintWaybillsRequest;
import club.mrxiao.sf.bean.print.ComReceCloudPrintWaybillsResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SfPrintServiceImpl implements SfPrintService {
    private SfService sfService;

    @Override
    public ComReceCloudPrintWaybillsResponse printWaybills(ComReceCloudPrintWaybillsRequest request) throws ExpressErrorException {
        BaseRequest r = new BaseRequest(request.getServiceCode(), request.toJson());
        r.build(sfService.getConfig());
        String post = this.sfService.post(r);
        return ComReceCloudPrintWaybillsResponse.fromJson(post);
    }
}
