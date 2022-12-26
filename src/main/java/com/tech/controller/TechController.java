package com.tech.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tech-service")
public class TechController {

    Logger LOGGER = LoggerFactory.getLogger(TechController.class);

    @Operation(summary = "Tech service", description = "Tech service")
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Operation Successful",
                            content =
                            @Content(
                                    mediaType = MediaType.TEXT_PLAIN_VALUE,
                                    schema = @Schema(implementation = String.class)))
            })
    @GetMapping
    public String checkService() {
        return "Working...";
    }

    @Operation(summary = "Tech Logging", description = "Tech Logging")
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Operation Successful",
                            content =
                            @Content(
                                    mediaType = MediaType.TEXT_PLAIN_VALUE,
                                    schema = @Schema(implementation = String.class)))
            })
    @GetMapping("/check-logging")
    public String checkLogging() {
        LOGGER.info("Logging info message.");
        LOGGER.warn("Logging warn message.");
        LOGGER.debug("Logging debug message.");
        LOGGER.error("Logging error message.");
        return "Logged , Please check your console.";
    }

}
