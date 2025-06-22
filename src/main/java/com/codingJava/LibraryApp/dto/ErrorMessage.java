package com.codingJava.LibraryApp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorMessage {

    private LocalDateTime timestamp;
    private String message;
    private String details;
    private String path;
    private Boolean isEnvDevActive;



//    private boolean shouldShowPath(String profile) {
//        return "dev".equalsIgnoreCase(profile);
//    }
}
