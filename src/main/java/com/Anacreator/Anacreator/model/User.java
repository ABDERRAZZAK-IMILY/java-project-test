package com.Anacreator.Anacreator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // تخبر Spring بأن هذا الكلاس يمثل جدولاً في قاعدة البيانات
@Table(name = "users") // تحديد اسم الجدول (اختياري)
@Data // من مكتبة Lombok: لإنشاء Getters, Setters, toString تلقائيًا
@NoArgsConstructor // من مكتبة Lombok: لإنشاء Constructor فارغ
public class User {

    @Id // يحدد أن هذا الحقل هو المفتاح الأساسي (Primary Key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // لجعل قاعدة البيانات تقوم بزيادة الرقم تلقائيًا
    private Long id;

    private String username;
    private String email;
    private String password;
    // يمكن إضافة حقول أخرى لاحقًا مثل isSeller, description, etc.
}