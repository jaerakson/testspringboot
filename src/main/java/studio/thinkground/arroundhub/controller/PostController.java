package studio.thinkground.arroundhub.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import studio.thinkground.arroundhub.data.dto.MemberDTO;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api") //공동의 URL 선언
public class PostController {
    //http://localhost:8080/api/v1/post-api/default
    @PostMapping(value = "/default")
    public String postMethod (){
        return "post hello!....";
    }
    //http://localhost:8080/api/v1/post-api/member
    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String,Object>  postData ){

        StringBuilder sb = new StringBuilder() ;

        postData.entrySet().forEach( map -> {
            sb.append(map.getKey()+":"+map.getValue()+"\n") ;
        });

        return sb.toString();
    }
    //http://localhost:8080/api/v1/post-api/member2

    @PostMapping(value = "/member2")
    @Operation(summary = "조회", description = "user가 포함된 모든 프로젝트를 조회")
    public String postMember2(@RequestBody MemberDTO memberDTO){
        return  memberDTO.toString();
    }
}
