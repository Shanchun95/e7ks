package com.dashan.exam.controller;

import com.dashan.exam.common.ResponseMap;
import com.dashan.exam.po.dto.E7CertClassifyDto;
import com.dashan.exam.po.vo.CertClassifyVo;
import com.dashan.exam.po.vo.E7CertClassifyVo;
import com.dashan.exam.service.E7CertClassifyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName: E7CertClassifyContorller
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/02/13  下午 10:55
 */
@Controller
@RequestMapping("classify")
public class E7CertClassifyController {
    @Resource
    private E7CertClassifyService e7CertClassifyService;
    /**
     * @Description: 查询证书类别列表
     * @Param: []
     * @return: java.lang.String
     * @Author: shanchun
     * @Date: 2020/02/14 下午 12:32
     **/
    @RequestMapping(value = "/select_classify_list", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    @CrossOrigin
    public ResponseMap selectList(HttpServletRequest request,
//                             @RequestBody RequestJsonDto requestJsonDto,
                                  @RequestHeader(value = "X-Token", required = false) String token){
        List<E7CertClassifyVo> e7CertClassifyDtos = e7CertClassifyService.selectList();
        return ResponseMap.success(e7CertClassifyDtos);
    }

    @RequestMapping(value = "/select_cert_list", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    @CrossOrigin
    public ResponseMap selectCertList(HttpServletRequest request,
//                             @RequestBody RequestJsonDto requestJsonDto,
                             @RequestHeader(value = "X-Token", required = false) String token){
        List<CertClassifyVo> certClassifyVos = e7CertClassifyService.selectCertList();
        return ResponseMap.success(certClassifyVos);
    }

    /**
    * @Description: 新增证书类别
    * @Param: []
    * @return: java.lang.String
    * @Author: shanchun
    * @Date: 2020/02/16 下午 11:08
    **/
    @RequestMapping(value = "/add_classify", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    @CrossOrigin
    public ResponseMap selectList(HttpServletRequest request,
                              @RequestBody E7CertClassifyDto e7CertClassifyDto,
                              @RequestHeader(value = "X-Token", required = false) String token){
        Integer flg = e7CertClassifyService.addCertClassify(e7CertClassifyDto);
        if (flg > 0){
            return ResponseMap.success();
        }
        return ResponseMap.fail();
    }

    /**
    * @Description: 修改证书类别
    * @Param: [dto]
    * @return: java.lang.Integer
    * @Author: shanchun
    * @Date: 2020/02/16 下午 11:17
    **/
    @RequestMapping(value = "/update_classify", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    @CrossOrigin
    public ResponseMap updateClassify(HttpServletRequest request,
                                  @RequestBody E7CertClassifyDto e7CertClassifyDto,
                                  @RequestHeader(value = "X-Token", required = false) String token){
        Integer flg = e7CertClassifyService.updateCertClassify(e7CertClassifyDto);
        if (flg > 0){
            return ResponseMap.success();
        }
        return ResponseMap.fail();
    }
    /**
    * @Description: 删除证书类型
    * @Param: [sign]
    * @return: java.lang.Integer
    * @Author: shanchun
    * @Date: 2020/02/16 下午 11:14
    **/
    @RequestMapping(value = "/delete_classify", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    @CrossOrigin
    public ResponseMap deleteClassify(HttpServletRequest request,
                                  @RequestBody E7CertClassifyDto e7CertClassifyDto,
                                  @RequestHeader(value = "X-Token", required = false) String token){
        Integer flg = e7CertClassifyService.deleteCertClassify(e7CertClassifyDto.getId());
        if (flg > 0){
            return ResponseMap.success();
        }
        return ResponseMap.fail();
    }

}
