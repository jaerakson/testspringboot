package studio.thinkground.arroundhub.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import studio.thinkground.arroundhub.dto.MemberDTO;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/v1/get-api") //공동의 URL 선언
public class GetConttroller {
    //http://localhost:8080/api/v1/get-api/hello
    @RequestMapping( value = "/hello", method = RequestMethod.GET)
    public String getHello(){
        return "Hello World222";
    }
    //http://localhost:8080/api/v1/get-api/name
    @GetMapping(value = "/name")
    public String getName(){
        return "Flature";
    }

    //http://localhost:8080/api/v1/get-api/variable1/{String 값}
    @GetMapping(value = "variable1/{variable}")
    public String getVarible1(@PathVariable String variable){
        return variable;
    }

    //http://localhost:8080/api/v1/get-api/variable2/{String 값}
    @GetMapping(value = "variable2/{variable}")
    public String getVarible2(@PathVariable("variable") String var){
        return var;
    }

    //http://localhost:8080/api/v1/get-api/request1?name=flature6&email=kkk@grg.co.kr&organization=grg
    @GetMapping(value = "/request1")
    public String getRequest1(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam String organization)
    {
        return  name + " " + email + " " + organization+" ";
    }

    //http://localhost:8080/api/v1/get-api/request2?key1=value1&key2=value2
    @GetMapping(value = "request2")
    public String getRequest2(@RequestParam Map<String ,String> param){
        StringBuilder sb= new StringBuilder();

        param.entrySet().forEach( map -> {
            sb.append(map.getKey()+"|"+map.getValue()+"\n");
        });

        return sb.toString();
    }


    //http://localhost:8080/api/v1/get-api/request3?name=flature6&email=kkk@grg.co.kr&organization=grg
    @GetMapping(value = "request3")
    public String getRequest3(MemberDTO memberDTO){
        return memberDTO.toString();
    }
}
