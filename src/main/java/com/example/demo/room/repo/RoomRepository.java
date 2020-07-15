package com.example.demo.room.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.room.entity.RoomEntity;

public interface RoomRepository extends JpaRepository<RoomEntity, Long>{

}
