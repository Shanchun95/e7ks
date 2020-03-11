package com.dashan.exam.controller;

import com.dashan.exam.common.ResponseMap;
import com.dashan.exam.po.dto.E7CertDto;
import com.dashan.exam.service.E7CertService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: E7CertController
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/03/06  上午 11:43
 */
@Controller
@RequestMapping("cert")
public class E7CertController {
    @Resource
    E7CertService e7CertService;

    @RequestMapping("/select_cert_by_id")
    @ResponseBody
    @CrossOrigin
    public ResponseMap selectCertById(HttpServletRequest request,
                               @RequestBody E7CertDto e7CertDto,
                               @RequestHeader(value = "X-Token", required = false) String token){
        E7CertDto dto = e7CertService.selectCertById(e7CertDto.getId());
        if (dto != null){
            return ResponseMap.success(dto);
        }
        return ResponseMap.fail();
    }
    /**
    * @Description:
    * @Param: [request, e7CertDto, token]
    * @return: com.dashan.exam.common.ResponseMap
    * @Author: shanchun
    * @Date: 2020/03/06 上午 11:50
    **/
    @RequestMapping("/add_cert")
    @ResponseBody
    @CrossOrigin
    public ResponseMap addCert(HttpServletRequest request,
                               @RequestBody E7CertDto e7CertDto,
                               @RequestHeader(value = "X-Token", required = false) String token){
        Integer integer = e7CertService.addCert(e7CertDto);
        if (integer == 1){
            return ResponseMap.success();
        }else {
            return ResponseMap.fail();
        }
    }

    @RequestMapping("/delete_cert_by_id")
    @ResponseBody
    @CrossOrigin
    public ResponseMap deleteCert(HttpServletRequest request,
                               @RequestBody E7CertDto e7CertDto,
                               @RequestHeader(value = "X-Token", required = false) String token){
        Integer integer = e7CertService.deleteCert(e7CertDto.getId());
        if (integer == 1){
            return ResponseMap.success();
        }else {
            return ResponseMap.fail();
        }
    }
}
