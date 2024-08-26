package com.vmware.tanzu.gemfire.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import lombok.ToString;

//@EqualsAndHashCode(of = { "name", "quantity",  "Mmeasurement"})
//@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor //(access = AccessLevel.PROTECTED)
@ToString
public class Ingredient {
    @Getter @Id @NonNull
    String name;

    @Getter  @NonNull
    Double quantity;

    @Getter @NonNull
    String measurement;
}
