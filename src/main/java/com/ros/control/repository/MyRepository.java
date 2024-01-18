package com.ros.control.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ros.control.entity.RosNetworkEntity;

@Repository
public interface MyRepository extends JpaRepository<RosNetworkEntity, Long> {
    
    @Query(value = "SELECT * FROM ros_network WHERE password = :hashedPassword", nativeQuery = true)
    RosNetworkEntity LilBitchPussy(@Param("hashedPassword") int hashedPwd);
}
