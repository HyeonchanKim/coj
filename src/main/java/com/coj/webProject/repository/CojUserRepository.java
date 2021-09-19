package com.coj.webProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coj.webProject.data.CojUser;

@Repository
public interface CojUserRepository extends JpaRepository<CojUser, Integer> {

}
