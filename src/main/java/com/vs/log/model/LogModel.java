package com.vs.log.model;


import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RegisterForReflection
public class LogModel {
    String partner;
    String type;
    String request;
    String method;
    String response;
    String code;
    String requestId;
}
