package com.nba.hotel_management_system.repository;

import com.nba.hotel_management_system.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
