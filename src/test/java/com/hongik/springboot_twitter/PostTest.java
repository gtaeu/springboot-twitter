package com.hongik.springboot_twitter;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    @Test
    void getContent() {
        Post post = new Post(1L, "테스트", LocalDateTime.now());
        assertEquals("테스트", post.getContent());
    }
}