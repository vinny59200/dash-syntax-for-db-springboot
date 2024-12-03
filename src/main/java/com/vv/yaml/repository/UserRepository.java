package com.vv.yaml.repository;

import com.vv.yaml.domain.VvUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<VvUser, Long> {
}
