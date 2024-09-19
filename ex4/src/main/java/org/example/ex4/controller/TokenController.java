package org.example.ex4.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.ex4.member.dto.MemberDTO;
import org.example.ex4.member.service.MemberService;
import java.util.Map;
@RestController
@RequestMapping("/api/v1/token")
@Log4j2
@RequiredArgsConstructor
public class TokenController {
    private final MemberService memberService;
    @PostMapping("/make")
    public ResponseEntity<MemberDTO> makeToken(@RequestBody MemberDTO memberDTO) {
        log.info("Make token");
        MemberDTO memberDTOResult = memberService.read(memberDTO.getMid(), memberDTO.getMpw());
        log.info(memberDTOResult);
        return null;
    }


}
