package com.devdynamos.service;

import com.devdynamos.dto.TwitDto;
import com.devdynamos.exception.WebException;
import com.devdynamos.mapper.TwitMapper;
import com.devdynamos.repository.TwitRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TwitService {
    private final TwitRepository twitRepository;
    private final TwitMapper twitMapper;

    public List<TwitDto> findAll() {
        return twitRepository.findAll()
                .stream()
                .map(twitMapper::twitToTwitDto)
                .toList();
    }

    public TwitDto findById(long id) {
        return twitRepository.findById(id)
                .map(twitMapper::twitToTwitDto)
                .orElseThrow(() -> new WebException(HttpStatus.NOT_FOUND, "Twit not found"));
    }
}
