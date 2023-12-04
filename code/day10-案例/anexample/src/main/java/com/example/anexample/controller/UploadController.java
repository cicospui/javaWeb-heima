package com.example.anexample.controller;

import com.example.anexample.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Description: 服务端接收文件的controller
 * @Author: 徐晓宇
 * @Date: 2023/12/4 15:38
 */
@Slf4j
@RestController
public class UploadController {

    @PostMapping("/upload")
    public Result upload(String username, Integer age, MultipartFile image) throws Exception {
        log.info("接收到文件上传请求，参数为：{},{},{}",username,age,image.getOriginalFilename());
        // 获取原始文件名
        String filename = image.getOriginalFilename();

        // 构造唯一的文件名（不重复）---uuid，如1e4624fa-7bab-49d2-863f-c85466fa4599，就可以在uuid后加上原始名称的拓展名
        int index = filename.lastIndexOf(".");
        String extname = filename.substring(index);
        String newFilename = UUID.randomUUID().toString() + extname;
        log.info("新文件名：{}",newFilename);

        // 将文件存储在本地磁盘目录中
        image.transferTo(new File("D:\\JavaWebTemp\\"+newFilename));

        return Result.success();
    }

}
