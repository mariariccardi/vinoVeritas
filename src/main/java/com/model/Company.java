package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Company {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@NotNull
private String name;

@Nullable
private String address;

@Nullable
private String city;

@NotNull
@ManyToOne
@JoinColumn(name = "userId", referencedColumnName = "id")
private User user ;

}
