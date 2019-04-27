package com.httpbase.httpbase.controller;


import com.httpbase.httpbase.entity.StudentSubject;
import com.httpbase.httpbase.entity.TArea;
import com.httpbase.httpbase.service.StudentSubjectService;
import com.httpbase.httpbase.service.TAreaService;
import com.httpbase.httpbase.vo.AreaInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("http")
public class HttpController {

    @Autowired
    private StudentSubjectService studentSubjectService;

    @Autowired
    private TAreaService tAreaService;

    @RequestMapping("index")
    public List<StudentSubject> getIndex(){


        return studentSubjectService.getAll();
    }

    @RequestMapping("city")
    public List<TArea> showChinaArea() {
        List<TArea> list =  tAreaService.showAllArea();

        Map<TArea, List<TArea>> map = createAreas(list);



        return null;
    }

    private Map<TArea, List<TArea>> createAreas(List<TArea> list) {
        List<AreaInfo> areaInfos = new ArrayList<>();

        int length = list.size(); // 数组长度，效率问题
        for(int i = 0; i < length; i++) {
            if("-1".equals(list.get(i).getParentid())) {

            }
            else {
                list.remove(i);
            }
        }
        System.out.println("HttpController.createAreas --- " + list.toString());
        return null;

    }
}
