package club.mrxiao.sf.api;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.sf.bean.order.*;
import club.mrxiao.sf.bean.print.PrintSfOrderResponse;

/**
 * <pre>
 * 顺丰订单api接口
 * </pre>
 *
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
public interface SfOrderService {

    /**
     * 创建订单
     *
     * @param request {@link CreateOrderRequest} 下订单请求对象
     * @return {@link CreateOrderResponse} 创建订单响应对象
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    CreateOrderResponse createOrder(CreateOrderRequest request) throws ExpressErrorException;

    /**
     * 订单结果查询
     *
     * @param request {@link OrderRespRequest} 订单结果查询请求对象
     * @return {@link OrderRespResponse} 订单结果查询响应对象
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    OrderRespResponse orderResp(OrderRespRequest request) throws ExpressErrorException;

    /**
     * 订单确认/取消
     *
     * @param request {@link UpdateOrderRequest} 订单确认/取消请求对象
     * @return {@link UpdateOrderResponse} 订单确认/取消响应对象
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    UpdateOrderResponse updateOrder(UpdateOrderRequest request) throws ExpressErrorException;

    /**
     * 获取面单打印数据
     *
     * @param request {@link OrderRespRequest} 订单结果查询请求对象
     * @return {@link PrintSfOrderResponse} 打印数据响应对象
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    PrintSfOrderResponse getPrintData(OrderRespRequest request) throws ExpressErrorException;

    /**
     * 清单运费查询接口-速运类API
     *
     * @param request 清单运费查询接口 查询对象
     * @return QuerySFWaybillResponse
     * @throws ExpressErrorException 异常信息
     */
    //清单运费查询接口
    QuerySFWaybillResponse querySFWaybill(QuerySFWaybillRequest request) throws ExpressErrorException;
}
