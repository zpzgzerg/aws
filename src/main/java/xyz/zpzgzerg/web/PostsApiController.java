package xyz.zpzgzerg.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import xyz.zpzgzerg.service.posts.PostsService;
import xyz.zpzgzerg.web.dto.PostsResponseDto;
import xyz.zpzgzerg.web.dto.PostsSaveRequestDto;
import xyz.zpzgzerg.web.dto.PostsUpdateRequestDto;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }



}
