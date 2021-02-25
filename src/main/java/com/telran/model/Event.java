package com.telran.model;

import lombok.*;
import lombok.experimental.Accessors;


@AllArgsConstructor
@NoArgsConstructor
@Accessors(fluent = true)
@Setter
@Getter
@Builder
@ToString
public class Event {
    String title;
    String type;
    int breaks;
    int ammount;
    String currency;
}
