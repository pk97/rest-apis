package com.example.restapis.user.exception;

import java.time.LocalDateTime;

public record ErrorDetails(LocalDateTime time, String message, String errorCode) {
}
