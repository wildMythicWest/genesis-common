package com.genesis.common.domain;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class InputDataWrapper implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String data;
    private DataType type;
}
