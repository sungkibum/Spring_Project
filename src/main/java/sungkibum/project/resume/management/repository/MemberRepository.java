package sungkibum.project.resume.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sungkibum.project.resume.management.entity.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
}
