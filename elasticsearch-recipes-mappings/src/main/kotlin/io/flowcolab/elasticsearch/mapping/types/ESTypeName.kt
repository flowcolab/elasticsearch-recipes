package io.flowcolab.elasticsearch.mapping.types

enum class ESTypeName(val typeName: String) {

    LONG("long"),

    INTEGER("integer"),

    SHORT("short"),

    BYTE("byte"),

    DOUBLE("double"),

    FLOAT("float"),

    HALF_FLOAT("half_float"),

    SCALED_FLOAT("scaled_float")
}