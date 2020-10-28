package io.flowcolab.elasticsearch.mapping.types.annotations

import io.flowcolab.elasticsearch.mapping.types.ESTypeName

@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY, AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class ESType(val typeName: ESTypeName) {
}