package com.ddf.demo.user.controller.dto.response;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StudyHistoryDto {

    private String studyId;
    private String SDRUploadVersion;


}
