package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entity.Address;

public interface IAddressRepository extends JpaRepository<Address, Integer>{

}
