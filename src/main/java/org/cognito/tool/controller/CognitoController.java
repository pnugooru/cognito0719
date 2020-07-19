package org.cognito.tool.controller;

import org.cognito.tool.service.CognitoService;
import org.cognito.tool.vo.CognitoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
public class CognitoController {

    @Autowired
    private CognitoService cognitoService;

    @GetMapping("/get-choices")
    public List<Map<String, Object>> getChoices(){
        return cognitoService.getChoices();
    }

    @PostMapping("/process-choice")
    public Object processChoice(@RequestBody CognitoVO vo){
        return cognitoService.processChoice(vo);
    }
    
    
    @PostMapping("/getscCode")
    public String getscCode(){
        return cognitoService.getscCode();
    }
    
    
    @PostMapping("/getRefreshCode")
    public String getRefreshCode(){
        return cognitoService.getRefreshCode();
    }
    
    @PostMapping("/submitMfa")
    public Object submitmfs(@RequestBody CognitoVO vo){
        return cognitoService.submitmfs(vo);
    }

    @PostMapping("/downloadDocument")
    public byte[] downloadDoc(@RequestBody CognitoVO vo) throws IOException {
        return cognitoService.downloadDocument(vo);
    }
    @PostMapping("/getdocumentData")
    public String getdocumentData(@RequestBody CognitoVO vo) throws IOException {
        return cognitoService.getdocumentData(vo);
    }
    @GetMapping("/getUserRole")
    public Object getUserRole() throws IOException {
    	System.out.println(cognitoService.getUserRole());
        return cognitoService.getUserRole();
    }

}
