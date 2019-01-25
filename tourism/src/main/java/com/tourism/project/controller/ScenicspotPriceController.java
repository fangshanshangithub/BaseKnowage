package com.tourism.project.controller;

import com.tourism.project.entity.ScenicspotPrice;
import com.tourism.project.entity.vo.JsonResponse;
import com.tourism.project.service.ScenicspotPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/senicspotprice")
public class ScenicspotPriceController {

    @Autowired
    private ScenicspotPriceService scenicspotPriceService;

    @RequestMapping("index")
    public JsonResponse index(ScenicspotPrice scenicspotPrice) {
        int i = scenicspotPriceService.save(scenicspotPrice);

        if(i > 0) {
            return JsonResponse.success(i);
        }
        else {
            return JsonResponse.fail();
        }

    }


    /**
     * 添加 景点价格
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public JsonResponse add(ScenicspotPrice scenicspotPrice) {
        int i = scenicspotPriceService.save(scenicspotPrice);

        if(i > 0) {
            return JsonResponse.success(i);
        }
        else {
            return JsonResponse.fail();
        }

    }

    /**
     * 获取所有 景点价格列表
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public JsonResponse getAll() {
        List<ScenicspotPrice> list = scenicspotPriceService.findAll();
            return JsonResponse.success(list);
    }

    /**
     * 更新指定id的景点价格记录
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public JsonResponse update(ScenicspotPrice scenicspotPrice) {
        int i = scenicspotPriceService.update(scenicspotPrice);
        if(i > 0) {
            return JsonResponse.success(i);
        }
        else {
            return JsonResponse.fail();
        }

    }


    /**
     * 获取某个id 的记录
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public JsonResponse getById(@PathVariable("id") Long id) {
        ScenicspotPrice  data  =  scenicspotPriceService.findById(id);
        return JsonResponse.success(data);
    }

    /**
     * 删除 指定id记录
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public JsonResponse delete(@PathVariable("id") Long id) {
        int i = scenicspotPriceService.delete(id);
        if(i > 0) {
            return JsonResponse.success(i);
        }
        else {
            return JsonResponse.fail();
        }
    }

}
