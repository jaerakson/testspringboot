package studio.thinkground.arroundhub.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import studio.thinkground.arroundhub.dto.MemberDTO;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")

public class PutController {
    //http://localhost:8080//api/v1/put-api/default
    @PutMapping(value = "/default")
    public String putMethod() { return "put hello world";}

    //http://localhost:8080//api/v1/put-api/member
    @PutMapping(value = "/member")
    private String putMember(@RequestBody Map<String, Object> PutData){
        StringBuilder sb = new StringBuilder();

        PutData.entrySet().forEach(map->{
            sb.append(map.getKey()+":"+map.getValue()+"\n");
        });
        return   sb.toString();
    }
    //http://localhost:8080//api/v1/put-api/member1
    @PutMapping(value = "/member1")
    private String putMemberDto1(@RequestBody MemberDTO memberDTO){

        return memberDTO.toString();
    }
    //http://localhost:8080//api/v1/put-api/member2
    @PutMapping(value = "/member2")
    private MemberDTO putMemberDto2(@RequestBody MemberDTO memberDTO){
        return memberDTO;
    }
    //http://localhost:8080//api/v1/put-api/member3
    @PutMapping(value = "/member3")
    private ResponseEntity<MemberDTO> putMember3(@RequestBody MemberDTO memberDTO){

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO);
    }
}

