package com.Anacreator.Anacreator.repository;

import com.Anacreator.Anacreator.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // للدلالة على أن هذه الواجهة هي مستودع بيانات
public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository توفر لنا دوال جاهزة مثل save(), findById(), findAll()
    // لا نحتاج لكتابة أي كود هنا الآن!
}