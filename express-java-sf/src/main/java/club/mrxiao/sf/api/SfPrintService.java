package club.mrxiao.sf.api;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.sf.bean.order.*;
import club.mrxiao.sf.bean.print.ComReceCloudPrintWaybillsRequest;
import club.mrxiao.sf.bean.print.ComReceCloudPrintWaybillsResponse;
import club.mrxiao.sf.bean.print.PrintSfOrderResponse;

/**
 * <pre>
 * 顺丰面单接口
 * </pre>
 *
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
public interface SfPrintService {

    /**
     * 创建订单
     *
     * @param request {@link CreateOrderRequest} 下订单请求对象
     * @return {@link CreateOrderResponse} 创建订单响应对象
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    ComReceCloudPrintWaybillsResponse printWaybills(ComReceCloudPrintWaybillsRequest request) throws ExpressErrorException;

}
