package com.devdynamos.controller;

import com.devdynamos.dto.TwitDto;
import com.devdynamos.service.TwitService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Twit")
@RestController
@RequiredArgsConstructor
@RequestMapping("api/twit")
public class TwitController {

    private final TwitService twitService;

    @Operation(summary = "Find all twits")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "List of twits"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")
    })
    @GetMapping
    public List<TwitDto> findAll() {
        return twitService.findAll();
    }

    @Operation(summary = "Find twit")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Twit is found"),
            @ApiResponse(responseCode = "400", description = "Bed request"),
            @ApiResponse(responseCode = "404", description = "Twit is not found"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")

    })
    @GetMapping("/{id}")
    public TwitDto findById(@PathVariable long id) {
        return twitService.findById(id);
    }
}
