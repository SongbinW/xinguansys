package cn.junang.sys.controller;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;
import cn.junang.sys.service.DonationService;
import org.springframework.web.bind.annotation.*;

/**
 * @author wchen
 * @create 2020-07-09 15:44
 */
@RestController
@RequestMapping("sys/donation")
/*捐赠*/
public class DonationController {
    private final DonationService donationService;

    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }
    @GetMapping
    public R getAll(PageBean pageBean){
        return donationService.getAll(pageBean);
    }

}
