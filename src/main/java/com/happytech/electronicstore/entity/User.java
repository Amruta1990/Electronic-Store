package com.happytech.electronicstore.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User extends BaseEntity {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long userId;
   @Column(name="user_name")
    private String name;
     @Column(name="user_email",unique = true)
    private String email;

  @Column(name="user_password",length=10)
    private String password;


    private String gender;
 @Column(length=1000)
    private  String about;
@Column(name="user_image_name")
    private String imageName;


}

