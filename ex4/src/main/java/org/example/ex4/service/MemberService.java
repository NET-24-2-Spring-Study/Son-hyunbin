package org.example.ex4.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.example.ex4.member.dto.MemberDTO;
import org.example.ex4.member.entity.MemberEntity;
import org.example.ex4.member.exception.MemberExceptions;
import org.example.ex4.member.repository.MemberRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Log4j2
@Transactional
public class MemberService {
private final MemberRepository memberRepository;
private final PasswordEncoder passwordEncoder;
public MemberDTO read(String mid,String mpw){
  Optional <MemberEntity> result = memberRepository.findById(mid);
  MemberEntity memberEntity = result.orElse(MemberExceptions.BAD_CREDENTIALS::get);
  if(!passwordEncoder.matches(mpw,memberEntity.getMpw())){
      throw MemberExceptions.BAD_CREDENTIALS.get();
  }
  return new MemberDTO(memberEntity);
}
}
