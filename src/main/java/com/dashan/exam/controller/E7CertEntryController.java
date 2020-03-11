package com.dashan.exam.controller;

import com.dashan.exam.common.ResponseMap;
import com.dashan.exam.po.E7CertEntry;
import com.dashan.exam.po.dto.E7CertEntryDto;
import com.dashan.exam.service.E7CertEntryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName: E7CertEntryController
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/02/13  下午 10:56
 */
@Controller
@RequestMapping("entry")
public class E7CertEntryController {
    @Resource
    private E7CertEntryService e7CertEntryService;

    /**
    * @Description:  查询证书列表
    * @Param: []
    * @return: java.lang.String
    * @Author: shanchun
    * @Date: 2020/02/16 下午 11:24
    **/
    @RequestMapping("select_entry_list")
    @ResponseBody
    @CrossOrigin
    public ResponseMap selectCertEntryList(HttpServletRequest request,
//                                      @RequestBody RequestJsonDto requestJsonDto,
                                           @RequestHeader(value = "X-Token", required = false) String token){
        List<E7CertEntry> e7CertEntries = e7CertEntryService.selectList();
        return ResponseMap.success(e7CertEntries);
    }

    /**
    * @Description:  新增证书信息
    * @Param: [dto]
    * @return: java.lang.Integer
    * @Author: shanchun
    * @Date: 2020/02/16 下午 11:23
    **/
    @RequestMapping("add_entry")
    @ResponseBody
    @CrossOrigin
    public ResponseMap addEntry(HttpServletRequest request,
                            @RequestBody E7CertEntryDto e7CertEntryDto,
                            @RequestHeader(value = "X-Token", required = false) String token) {
//        String data = requestJsonDto.getData();
//        E7CertEntryDto e7CertEntryDto = (E7CertEntryDto) JSONUtil.JSONToObj(data, E7CertEntryDto.class);
        Integer flg = e7CertEntryService.addCertEntry(e7CertEntryDto);
        if (flg > 0){
            return ResponseMap.success();
        }
        return ResponseMap.fail();
    }
    /**
    * @Description: 修改证书信息
    * @Param: [dto]
    * @return: java.lang.Integer
    * @Author: shanchun
    * @Date: 2020/02/16 下午 11:25
    **/
    @RequestMapping("update_entry")
    @ResponseBody
    @CrossOrigin
    public ResponseMap updateEntry(HttpServletRequest request,
                               @RequestBody E7CertEntryDto e7CertEntryDto,
                               @RequestHeader(value = "X-Token", required = false) String token) {
        Integer flg = e7CertEntryService.updateCertEntry(e7CertEntryDto);
        if (flg > 0){
            return ResponseMap.success();
        }
        return ResponseMap.fail();
    }

    @RequestMapping("delete_entry")
    @ResponseBody
    @CrossOrigin
    public ResponseMap deleteEntry(HttpServletRequest request,
                               @RequestBody E7CertEntryDto e7CertEntryDto,
                               @RequestHeader(value = "X-Token", required = false) String token) {
        Integer flg = e7CertEntryService.deleteCertEntry(e7CertEntryDto.getId());
        if (flg > 0){
            return ResponseMap.success();
        }
        return ResponseMap.fail();
    }
}
