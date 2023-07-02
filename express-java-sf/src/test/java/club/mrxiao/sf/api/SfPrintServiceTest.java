package club.mrxiao.sf.api;

import club.mrxiao.sf.bean.print.ComReceCloudPrintWaybillsRequest;
import club.mrxiao.sf.bean.print.ComReceCloudPrintWaybillsResponse;
import club.mrxiao.sf.bean.print.PrintSfOrderDocument;
import club.mrxiao.sf.test.ApiTestModule;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

@Guice(modules = ApiTestModule.class)
public class SfPrintServiceTest {
    private final Log log = LogFactory.get(this.getClass().getName());

    @Inject
    private SfService sfService;


    @Test
    public void testPrintWaybills() {
        PrintSfOrderDocument document = new PrintSfOrderDocument();
        document.setMasterWaybillNo("SF7444467326571");
        document.setIsPrintLogo(true);
        document.setSystemSource("scp");
        document.setPrintNum("1");
        document.setPrintDateTime("2023-06-26 01:01:01");
        document.setAgingText("特快");
        document.setDestRouteLabel("755WD-755BFDGF");
        document.setDestTeamCode("002");
        document.setFromName("物流大道仓库");
        document.setFromPhone("021-58952763");
        document.setFromOrgName("物流大道仓库公司");
        document.setFromAddress("上海市浦东新区物流大道1126号1-13号仓");
        document.setToName("SH-SV-服务商-凯瑞捷-成都 54078329 CAS-534816-X2K1B2");
        document.setToPhone("17527344190");
        document.setToOrgName("凯瑞捷公司");
        document.setToAddress("成都市金牛区北三环路一段221号华侨城创想中心1号楼A座2015");
        document.setPayment("寄付月结");
        document.setCodingMapping("1A");
        document.setTwoDimensionCode("MMM={'k1':'571WA','k2':'571KM','k3':'005','k4':'T4','k5':'SF1013329394337','k6':'','k7':'6490979f'}");
        document.setAbFlag("b");
        document.setCodingMappingOut("1A");

        ComReceCloudPrintWaybillsResponse comReceCloudPrintWaybillsResponse = this.sfService.getSfPrintService().printWaybills(ComReceCloudPrintWaybillsRequest.builder()
                .documents(Arrays.asList(document))
                .sync(true)
                .templateCode(this.sfService.getConfig().getPrintTemplateCode())
                .build());
        System.out.println(comReceCloudPrintWaybillsResponse);
    }
}