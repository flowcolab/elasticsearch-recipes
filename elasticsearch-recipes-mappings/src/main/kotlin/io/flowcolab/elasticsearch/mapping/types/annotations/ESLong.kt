package io.flowcolab.elasticsearch.mapping.types.annotations

import io.flowcolab.elasticsearch.mapping.types.ESTypeName
import io.flowcolab.elasticsearch.mapping.types.properties.ESLongProperties
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
@ESType(ESTypeName.LONG)
@MustBeDocumented
annotation class ESLong(val properties: KClass<ESLongProperties>)