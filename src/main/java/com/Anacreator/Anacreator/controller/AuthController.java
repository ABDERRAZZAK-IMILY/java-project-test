package com.Anacreator.Anacreator.controller;

import com.Anacreator.Anacreator.model.User;
import com.Anacreator.Anacreator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // يحدد أن هذا الكلاس سيعيد بيانات بصيغة JSON
@RequestMapping("/api/auth") // كل الطلبات لهذا الكنترولر يجب أن تبدأ بـ /api/auth
@CrossOrigin(origins = "http://localhost:4200") // للسماح لتطبيق Angular بالوصول لهذا الـ API
public class AuthController {

    @Autowired // يقوم Spring بحقن (Inject) كائن من UserRepository تلقائيًا
    private UserRepository userRepository;

    @PostMapping("/register") // للتعامل مع طلبات POST على /api/auth/register
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        // @RequestBody: يقوم بتحويل جسم الطلب (JSON) إلى كائن User
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser); // إرجاع المستخدم الذي تم حفظه مع حالة نجاح 200
    }
}