package com.nba.hotel_management_system.controller;

import com.nba.hotel_management_system.model.Room;
import com.nba.hotel_management_system.response.RoomResponse;
import com.nba.hotel_management_system.service.IRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rooms")
public class RoomController {

    private IRoomService roomService;

    @PostMapping("/add/new-room")
    public ResponseEntity<RoomResponse> addNewRoom(
           @RequestParam("photo") MultipartFile photo,
           @RequestParam("roomType")String roomType,
           @RequestParam("roomPrice")BigDecimal roomPrice) {

        Room savedRoom = roomService.addNewRoom(photo, roomType, roomPrice);

        RoomResponse response = new RoomResponse(savedRoom.getId(), savedRoom.getRoomType(),
                savedRoom.getRoomPrice());
        return ResponseEntity.ok(response);
    }
}