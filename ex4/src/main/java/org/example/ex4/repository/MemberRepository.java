package org.example.ex4.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.example.ex4.member.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, String> {
}
