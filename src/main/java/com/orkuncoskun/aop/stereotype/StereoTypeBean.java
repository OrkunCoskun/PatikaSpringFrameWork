package com.orkuncoskun.aop.stereotype;

import lombok.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@BenimStereoType
@Data @AllArgsConstructor @NoArgsConstructor
public class StereoTypeBean {
    private Long id;
    private String name="Merhabalar";
    private String trade;
}
