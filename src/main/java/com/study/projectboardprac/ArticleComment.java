package com.study.projectboardprac;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;

    private String content;
    private LocalDateTime createdAt;
    private String createdBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; // 수정자
}
