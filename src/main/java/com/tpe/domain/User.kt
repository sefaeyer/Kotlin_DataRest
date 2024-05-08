package com.tpe.domain

import jakarta.persistence.*


/*
     ************ KOTLIN DATA CLASS NEDIR *****************************
     * Otomatik Oluşturulan Fonksiyonlar:

    equals(): Nesnelerin eşitliğini kontrol eder.
    hashCode(): Nesnenin hash kodunu döndürür.
    toString(): Nesnenin string temsilini döndürür.
    copy(): Nesnenin bir kopyasını oluşturur.
    getter-setter metodları
 */

@Entity
@Table(name = "t_user")
data class User(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long, //@Getter

        @Column(nullable = false)
        var name: String, // Getter & Setter

        @Column(nullable = false)
        var email: String // Getter & Setter


){

    //JPA icin gerekli olan const
    protected constructor() : this(0,"","")


}
