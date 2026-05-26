package com.qbank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qbank.entity.UserAchievement;

public interface UserAchievementRepository extends JpaRepository<UserAchievement, Long> {
    List<UserAchievement> findByStudentId(Long studentId);
    boolean existsByStudentIdAndBadgeName(Long studentId, String badgeName);
}